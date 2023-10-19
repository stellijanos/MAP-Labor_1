package org.example;
public class BigArrayNumber {

    private int[] _numberArray;

    public BigArrayNumber(int...digits) {
        _numberArray = digits;
    }

    public int[] get_numberArray() {
        return _numberArray;
    }


    public void shiftValues(int digit) {
        int[] result = new int[_numberArray.length+1];
        result[0] = digit;
        System.arraycopy(_numberArray, 0, result, 1, _numberArray.length);
        _numberArray = result;
    }

    public int[] add (BigArrayNumber other) throws Exception {
        if (_numberArray.length == 0) {
            throw new EmptyArrayException("Array is empty");
        }
        if (_numberArray.length != other.get_numberArray().length) {
            throw new Exception("Array lengths do not match");
        }

        int remainder = 0;
        int newDigit;
        for (int i = _numberArray.length-1; i>=0; i--) {
            newDigit = _numberArray[i] + other.get_numberArray()[i];
            _numberArray[i] = newDigit % 10 + remainder;
            remainder = newDigit / 10;
        }

        if (remainder > 0) {
            shiftValues(1);
        }

        return _numberArray;
    }
}
