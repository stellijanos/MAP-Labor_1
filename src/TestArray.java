public class TestArray {
    public void runTests() {

        System.out.println("\n\nTests for Problem 2 - Array\n");

        Array numbers = new Array(40, 55, 60, 3, 90, 87, 69, 43);
        test_minimalNumber(numbers);
        test_maximalNumber(numbers);
        test_sumWithoutMinimalNumber(numbers);
        test_sumWithoutMaximalNumber(numbers);
    }

    private void test_minimalNumber(Array numbers) {
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

    private void test_maximalNumber(Array numbers) {
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

    private void test_sumWithoutMinimalNumber(Array numbers) {
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

    private void test_sumWithoutMaximalNumber(Array numbers) {

        int result = numbers.sumWithoutMaximalNumber();
        int expected = 357;
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
}
