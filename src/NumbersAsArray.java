public class NumbersAsArray {

    private int[] _number;
    public NumbersAsArray(int...numbers) {
        this._number = numbers;
    }

    private int ArrayToNumber(int[] numberAsArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int digit: numberAsArray) {
            stringBuilder.append(digit);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    private int[] NumberToArray(int number) {

        String numberAsString = Integer.toString(number);
        int[] result = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            char digitAsChar = numberAsString.charAt(i);
            result[i] = Character.getNumericValue(digitAsChar);
        }
        return result;
    }

    public int[] add(int[] array) {
        return NumberToArray(ArrayToNumber(_number) + ArrayToNumber(array));
    }

    public int[] subtract(int[] array) {
        return NumberToArray(ArrayToNumber(_number) - ArrayToNumber(array));
    }

    public int[] multiply(int number) {
        return NumberToArray(ArrayToNumber(_number) * number);
    }

}

