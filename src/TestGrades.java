
public class TestGrades {
    public void runTests() {
        Grades gradeHandler = new Grades();
        test_nextMultipleOf5(gradeHandler);
        test_round(gradeHandler);
    }

    private boolean successCase(int[] numbers, int[] expected, Grades gradeHandler, String methodName) {
        boolean success = true;

        for (int i = 0; i < numbers.length; i++) {
            try {
                assert gradeHandler.nextMultipleOf5(numbers[i]) == expected[i];
            } catch (AssertionError e) {
                success = false;
            }
        }
        return success;
    }

    private boolean failCase(int[] numbers, int[] expected, Grades gradeHandler) {
        boolean fail = true;
        for (int i = 0; i< numbers.length; i++) {
            try {
                assert gradeHandler.nextMultipleOf5(numbers[i]) == expected[i];
                fail = false;
            } catch (AssertionError e) {/**/}
        }
        return fail;
    }

    private void test_nextMultipleOf5(Grades gradeHandler) {
        int[] numbers    = {0, 10, 21, 32, 43, 54, 65, 76, 87, 98, 100};
        int[] expected   = {5, 15, 25, 35, 45, 55, 70, 80, 90, 100, 105};
        int[] unexpected = {0, 10, 20, 30, 40, 50, 65, 75, 85, 95, 100};

        boolean expectedResult   = true;
        boolean unexpectedResult = true;

        for (int i = 0; i < numbers.length; i++) {
            try {
                assert gradeHandler.nextMultipleOf5(numbers[i]) == expected[i];
            } catch (AssertionError e) {
                expectedResult= false;
            }

            try {
                assert gradeHandler.nextMultipleOf5(numbers[i]) == unexpected[i];
                unexpectedResult = false;
            } catch (AssertionError e) {/**/}
        }

        System.out.println("Test success case - multiple of 5 => " + (expectedResult ? "successful" : "failed") + '!');
        System.out.println("Test fail case - multiple of 5 => "  + (unexpectedResult ? "successful" : "failed") + '!');
    }

    public void test_round(Grades gradeHandler) {

        int[] numbers    = {0, 10, 21, 32, 43, 54, 65, 76, 87, 98, 100};
        int[] expected   = {0, 10, 21, 32, 45, 55, 65, 76, 87, 100, 100};
        int[] unexpected = {5, 15, 20, 30, 40, 50, 70, 80, 90, 95, 105};

        boolean expectedResult   = true;
        boolean unexpectedResult = true;

        for (int i = 0; i < numbers.length; i++) {
            try {
                assert gradeHandler.round(numbers[i]) == expected[i];
            } catch (AssertionError e) {
                expectedResult= false;
            }

            try {
                assert gradeHandler.round(numbers[i]) == unexpected[i];
                unexpectedResult = false;
            } catch (AssertionError e) {/**/}
        }

        System.out.println("Test success case - round => " + (expectedResult ? "successful" : "failed") + '!');
        System.out.println("Test fail case - round => "  + (unexpectedResult ? "successful" : "failed") + '!');
    }

}
