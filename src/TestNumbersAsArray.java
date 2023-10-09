public class TestNumbersAsArray {
    public void runTests() {

        System.out.println("\n\nTests for Problem 3 - Numbers as Array\n");
        test_ArrayToNumber();

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
}
