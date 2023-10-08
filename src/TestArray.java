public class TestArray {
    public void runTests() {

        System.out.println("\n\nTests for Problem 2 - Array\n");

        test_minimalNumber();
        test_maximalNumber();
        test_sumWithoutMinimalNumber();
        test_sumWithoutMaximalNumber();
    }

    private void test_minimalNumber() {
        Array numbers = new Array(40, 55, 60, 3, 90, 87, 69, 43);
        int result = numbers.minimalNumber();
        int expected = 3;
        int unexpected = 40;

        try {
            assert result == expected;
            System.out.println("Test success case - minimal number => successful!");
        } catch ( AssertionError e) {
            System.out.println("Test success case - minimal number => failed!");
        }

        try {
            assert result == unexpected;
            System.out.println("Test fail case - minimal number => failed!");
        } catch ( AssertionError e) {
            System.out.println("Test fail case - minimal number => successful!");
        }
    }

    private void test_maximalNumber() {
        Array numbers = new Array(40, 55, 60, 3, 90, 87, 69, 43);
        int result = numbers.maximalNumber();
        int expected = 90;
        int unexpected = 87;

        try {
            assert result == expected;
            System.out.println("Test success case - maximal number => successful!");
        } catch ( AssertionError e) {
            System.out.println("Test success case - maximal number => failed!");
        }

        try {
            assert result == unexpected;
            System.out.println("Test fail case - maximal number => failed!");
        } catch ( AssertionError e) {
            System.out.println("Test fail case - maximal number => successful!");
        }
    }

    private void test_sumWithoutMinimalNumber() {
        Array numbers = new Array(40, 55, 60, 3, 90, 87, 69, 43);
        int result = numbers.sumWithoutMinimalNumber();
        int expected = 444;
        int unexpected = 447;

        try {
            assert result == expected;
            System.out.println("Test success case - sum without minimal number => successful!");
        } catch ( AssertionError e) {
            System.out.println("Test success case - sum without minimal number => failed!");
        }

        try {
            assert result == unexpected;
            System.out.println("Test fail case - sum without minimal number => failed!");
        } catch ( AssertionError e) {
            System.out.println("Test fail case - sum without minimal number => successful!");
        }
    }

    private void test_sumWithoutMaximalNumber() {

    }

}
