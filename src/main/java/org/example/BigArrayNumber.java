package org.example;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

public class BigArrayNumber {

    private int[] _numberArray;

    public BigArrayNumber(int...digits) {
        _numberArray = digits;
    }

    public int[] get_numberArray() {
        return _numberArray;
    }

    public void add (BigArrayNumber other) throws Exception {
        if (_numberArray.length == 0) {
            throw new EmptyArrayException("Array is empty");
        }
        if (_numberArray.length != other.get_numberArray().length) {
            throw new Exception("Array lengths do not match");
        }

        int remainder;
        int newDigit;
        for (int i = _numberArray.length; true; i--) {
            remainder = 0;
            newDigit = _numberArray[i] + other.get_numberArray()[i];
            _numberArray[i] = newDigit % 10 + remainder;
            if (newDigit - 10 > 0) {
                remainder = 1;
            }
        }

        if (remainder > 0) {
            int[] finalResult = new int[_numberArray.length+1];
            finalResult[0] = 1;
            for ( int i = 0; i < _numberArray.length; i++) {
                finalResult[i+1] = _numberArray[i];
            }

        } else {

        }
    }
}
