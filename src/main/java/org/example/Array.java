package org.example;

public class Array {

    private final int[] _array;
    public Array(int...numbers) {
        this._array = numbers;
    }

    public int minimalNumber() {
        int minimalNumber = _array[0];
        for (Integer number: _array)
            if (minimalNumber > number)
                minimalNumber = number;
        return minimalNumber;
    }

    public int maximalNumber() {
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

    public int sumWithoutMinimalNumber() {
        return sum() - minimalNumber();
    }
    public int sumWithoutMaximalNumber() {
        return sum() - maximalNumber();
    }
}
