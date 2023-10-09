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

        String numberAsString = Integer.toString(number);
        int[] result = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            char digitAsChar = numberAsString.charAt(i);
            result[i] = Character.getNumericValue(digitAsChar);
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

