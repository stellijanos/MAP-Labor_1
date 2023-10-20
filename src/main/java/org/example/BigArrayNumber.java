package org.example;

import java.util.Arrays;

public class BigArrayNumber {

    private int[] _numberArray;

    public BigArrayNumber(int... digits) {
        _numberArray = digits;
    }

    public int[] get_numberArray() {
        return _numberArray;
    }

    public void shiftValues(int digit) {
        int[] result = new int[_numberArray.length + 1];
        result[0] = digit;
        System.arraycopy(_numberArray, 0, result, 1, _numberArray.length);
        _numberArray = result;
    }

    public int[] add(BigArrayNumber other) throws Exception {
        if (_numberArray.length == 0) {
            throw new EmptyArrayException("Array is empty");
        }
        if (_numberArray.length != other.get_numberArray().length) {
            throw new Exception("Array lengths do not match");
        }

        int[] otherNumberArray = new int[other.get_numberArray().length];
        System.arraycopy(other.get_numberArray(), 0, otherNumberArray, 0, otherNumberArray.length);

        int remainder = 0;
        int newDigit;
        for (int i = _numberArray.length - 1; i >= 0; i--) {
            newDigit = _numberArray[i] + otherNumberArray[i];
            _numberArray[i] = newDigit % 10 + remainder;
            remainder = newDigit / 10;
        }
        if (remainder > 0) {
            shiftValues(1);
        }
        return _numberArray;
    }

    public boolean isGreaterThan(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if (_numberArray[i] < number[i]) {
                return false;
            }
            if (_numberArray[i] > number[i]) {
                return true;
            }
        }
        return false;
    }


    public int[] subtract(BigArrayNumber other) throws Exception {
        if (_numberArray.length == 0) {
            throw new EmptyArrayException("Array is empty");
        }
        if (_numberArray.length != other.get_numberArray().length) {
            throw new Exception("Array lengths do not match");
        }

        int[] otherNumberArray = new int[other.get_numberArray().length];
        System.arraycopy(other.get_numberArray(), 0, otherNumberArray, 0, other.get_numberArray().length);

        int hasMinus1 = 1;

        if (!isGreaterThan(otherNumberArray)) {
            for (int i = 0; i < _numberArray.length; i++) {
                int digit = _numberArray[i];
                _numberArray[i] = otherNumberArray[i];
                otherNumberArray[i] = digit;
            }
            hasMinus1 = -1;
        }

        int[] result = new int[_numberArray.length];

        int borrow = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            int digit = 10 + _numberArray[i] - otherNumberArray[i] - borrow;
            borrow = digit < 10 ? 1 : 0;
            digit = digit < 10 ? digit : digit - 10;
            result[i] = digit;
        }

        result[0] *= hasMinus1;

        return result;

//        return add(new BigArrayNumber(otherNumberArray));
    }
}
