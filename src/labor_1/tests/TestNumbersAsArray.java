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
        int[] unexpected = new int[]{0, 1, 1, 1};

        int expectedErrorCount = 0, unexpectedErrorCount = 0;

        for (int i = 0; i < result.length; i++) {
            try {
                assert result[i] == expected[i];
            } catch (AssertionError e) {
                expectedErrorCount++;
            }

            try {
                assert result[i] == unexpected[i];
                unexpectedErrorCount++;
            } catch (AssertionError e) {/**/}
        }

        System.out.println("Test success case - number to array => " + (expectedErrorCount == 0 ? "successful" : "failed") + '!');
        System.out.println("Test fail case - number to array => "  + (unexpectedErrorCount == 0 ? "successful" : "failed") + '!');
    }
}
