package labor_1.tests;
import labor_1.classes.NumberAsArray;
public class TestNumbersAsArray {

    private void printArray(int[] array) {
        System.out.println(array.length);
        for (int digit : array) {
            System.out.print(digit);
        }
    }
    public void runTests() {

        System.out.println("\n\nTests for Problem 3 - Numbers as Array\n");
        test_ArrayToNumber();
        test_NumberToArray();
        test_add();
        test_subtract();

    }

    private void test_ArrayToNumber() {
        NumberAsArray numberAsArray = new NumberAsArray(1,0,0,0);

        int result = numberAsArray.arrayToNumber(numberAsArray.get());
        int expected = 1000;
        int unexpected = 1;

        try {
            assert expected == result;
            System.out.println("Test success case - Array to Number => successful");
        } catch (AssertionError e) {
            System.out.println("Test success case - Array to Number => failed");
        }

        try {
            assert unexpected == result;
            System.out.println("Test fail case - Array to Number => failed");
        } catch (AssertionError e) {
            System.out.println("Test fail case - Array to Number => successful");
        }
    }


    private void test_NumberToArray() {
        NumberAsArray numberAsArray = new NumberAsArray(1,0,0,0);
        int number = 1000;
        int[] result = numberAsArray.numberToArray(number);
        int[] expected = new int[]{1, 0, 0, 0};
        int[] unexpected = new int[]{1, 1, 1, 1};

        int expectedErrorCount = 0;

        for (int i = 0; i < result.length; i++) {
            try {
                assert result[i] == expected[i];
            } catch (AssertionError e) {
                expectedErrorCount++;
            }

            try {
                assert result[i] == unexpected[i];
            } catch (AssertionError e) {
                System.out.println("Test fail case - number to array => successful!");
            }
        }

        System.out.println("Test success case - number to array => " + (expectedErrorCount == 0 ? "successful" : "failed") + '!');
    }

    private void test_add() {
        NumberAsArray firstNumberAsArray = new NumberAsArray(1, 2, 3, 4, 5, 6, 7);
        NumberAsArray secondNumberAsArray = new NumberAsArray(6, 7, 8, 9, 0, 1, 2);
        int[] addition = firstNumberAsArray.add(secondNumberAsArray);

        int result = firstNumberAsArray.arrayToNumber(addition);
        int expected = firstNumberAsArray.arrayToNumber(new int[]{8, 0, 2, 3, 5, 7, 9});
        int unexpected = firstNumberAsArray.arrayToNumber(new int[]{7, 9, 1, 3, 5, 7, 9});

        try {
            assert result == expected;
            System.out.println("Test success case - add => successful!");
        } catch (AssertionError e) {
            System.out.println("Test success case - add => failed!");
        }

        try {
            assert result == unexpected;
            System.out.println("Test fail case - add => failed!");
        } catch (AssertionError e) {
            System.out.println("Test fail case - add => successful!");
        }
    }

    private void test_subtract() {
        NumberAsArray firstNumberAsArray = new NumberAsArray(1, 2, 3, 4, 5, 6, 7);
        NumberAsArray secondNumberAsArray = new NumberAsArray(6, 7, 8, 9, 0, 1, 2);
        int[] subtraction = firstNumberAsArray.subtract(secondNumberAsArray);

        int result = firstNumberAsArray.arrayToNumber(subtraction);
        int expected = firstNumberAsArray.arrayToNumber(new int[]{5,5,5,4,4,4,5});
        int unexpected = firstNumberAsArray.arrayToNumber(new int[]{7,9,1,3,5,7,9});
        try {
            assert result == expected;
            System.out.println("Test success case - subtract => successful!");
        } catch (AssertionError e) {
            System.out.println("Test success case - subtract => failed!");
        }

        try {
            assert result == unexpected;
            System.out.println("Test fail case - subtract => failed!");
        } catch (AssertionError e) {
            System.out.println("Test fail case - add => successful!");
        }

    }

}
