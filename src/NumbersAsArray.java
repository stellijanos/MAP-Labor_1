public class NumbersAsArray {

    private int numberOfDigits(int number) {
        int nrOfDigits = 0;
        while (number > 0) {
            nrOfDigits ++;
            number /= 10;
        }
        return nrOfDigits;
    }

    private int[] numberToArray(int number) {

        int nrOfDigits = numberOfDigits(number);

        int[] result = new int[numberOfDigits(number)];

        for (int i = 0; i < nrOfDigits; i++) {
            result[i] = number % 10;
            number /= 10;
        }

        return result;
    }
}
