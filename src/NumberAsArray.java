public class NumberAsArray {

    private final int[] _digits;

    public int[] get() {
        return _digits;
    }

    public NumberAsArray(int...digits) {
        this._digits = digits;
    }

    public int arrayToNumber(int[] numberAsArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int digit: numberAsArray) {
            stringBuilder.append(digit);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public int[] numberToArray(int number) {

        int numberOfDigits = (int) Math.log10(number) + 1;

        int[] result = new int[numberOfDigits];
        for (int i = numberOfDigits - 1; i >= 0; i--) {
            result[i] = number % 10;
            number /= 10;
        }
        return result;
    }

    public int[] add(int...digits) {
        return numberToArray(arrayToNumber(_digits) + arrayToNumber(digits));
    }

    public int[] subtract(int...digits) {
        return numberToArray(arrayToNumber(_digits) - arrayToNumber(digits));
    }

    public int[] multiply(int number) {
        return numberToArray(arrayToNumber(_digits) * number);
    }

    public int[] divide(int number) {
        return number == 0 ? new int[]{} : numberToArray(arrayToNumber(_digits) / number) ;
    }

}

