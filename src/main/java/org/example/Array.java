package org.example;

public class Array {

    private final int[] _array;
    public Array(int...numbers) {
        this._array = numbers;
    }

    public int minimalNumber() throws EmptyArrayException {
        if (_array.length == 0) {
            throw new EmptyArrayException("Array is emoty!");
        }
        int minimalNumber = _array[0];
        for (Integer number: _array)
            if (minimalNumber > number)
                minimalNumber = number;
        return minimalNumber;
    }

    public int maximalNumber() throws EmptyArrayException {
        if (_array.length == 0) {
            throw new EmptyArrayException("Array is emoty!");
        }
        int maximalNumber = _array[0];
        for (Integer number: _array)
            if (maximalNumber < number)
                maximalNumber = number;
        return maximalNumber;
    }

    public int sum() {
        int sum = 0;
        for (Integer number: _array)
            sum += number;
        return sum;
    }

    public int sumWithoutMinimalNumber() throws EmptyArrayException {
        return sum() - minimalNumber();
    }
    public int sumWithoutMaximalNumber() throws EmptyArrayException {
        return sum() - maximalNumber();
    }
}
