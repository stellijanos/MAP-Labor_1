public class NumbersAsArray {


    public int ArrayToNumber(int[] bigNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int digit: bigNumber) {
            stringBuilder.append(digit);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public int[] NumberToArray(int number) {

        String numberAsString = Integer.toString(number);
        int[] result = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            char digitAsChar = numberAsString.charAt(i);
            result[i] = Character.getNumericValue(digitAsChar);
        }
        return result;
    }


    public int[] add(int[] firstArray, int[] secondArray) {
        int result = ArrayToNumber(firstArray) + ArrayToNumber(secondArray);
        return NumberToArray(result);
    }




}
