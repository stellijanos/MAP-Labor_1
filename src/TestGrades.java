import java.util.ArrayList;
import java.util.Arrays;

public class TestGrades {
    public void runTests() {
        Grades gradeHandler = new Grades();
        test_nextMultipleOf5(gradeHandler, 0, 0);
        test_round(gradeHandler, 0, 0);
        test_isInsufficient(gradeHandler, 0, 0);
        test_sumOfArrayElements(gradeHandler);
    }

    private void test_nextMultipleOf5(Grades gradeHandler, int expectedErrorCount, int unexpectedErrorCount) {
        int[] numbers    = {0, 10, 21, 32, 43, 54, 65, 76, 87, 98, 100};
        int[] expected   = {5, 15, 25, 35, 45, 55, 70, 80, 90, 100, 105};
        int[] unexpected = {0, 10, 20, 30, 40, 50, 65, 75, 85, 95, 100};


        for (int i = 0; i < numbers.length; i++) {
            try {
                assert gradeHandler.nextMultipleOf5(numbers[i]) == expected[i];
            } catch (AssertionError e) {
                expectedErrorCount++;
            }

            try {
                assert gradeHandler.nextMultipleOf5(numbers[i]) == unexpected[i];
                unexpectedErrorCount++;
            } catch (AssertionError e) {/**/}
        }

        System.out.println("Test success case - multiple of 5 => " + (expectedErrorCount == 0 ? "successful" : "failed") + '!');
        System.out.println("Test fail case - multiple of 5 => "  + (unexpectedErrorCount == 0 ? "successful" : "failed") + '!');
    }

    private void test_round(Grades gradeHandler, int expectedErrorCount, int unexpectedErrorCount) {

        int[] numbers    = {0, 10, 21, 32, 43, 54, 65, 76, 87, 98, 100};
        int[] expected   = {0, 10, 21, 32, 45, 55, 65, 76, 87, 100, 100};
        int[] unexpected = {5, 15, 20, 30, 40, 50, 70, 80, 90, 95, 105};

        for (int i = 0; i < numbers.length; i++) {
            try {
                assert gradeHandler.round(numbers[i]) == expected[i];
            } catch (AssertionError e) {
                expectedErrorCount++;
            }

            try {
                assert gradeHandler.round(numbers[i]) == unexpected[i];
                unexpectedErrorCount++;
            } catch (AssertionError e) {/**/}
        }

        System.out.println("Test success case - round => " + (expectedErrorCount == 0 ? "successful" : "failed") + '!');
        System.out.println("Test fail case - round => "  + (unexpectedErrorCount == 0 ? "successful" : "failed") + '!');
    }

    private void test_isInsufficient(Grades gradeHandler, int expectedErrorCount, int unexpectedErrorCount) {
        int[] numbers        = {0, 36, 37, 38, 39, 40, 41, 42, 50, 100};
        boolean[] expected   = {true, true, true, false, false, false, false, false, false, false};

        for (int i = 0; i < numbers.length; i++) {
            try {
                assert gradeHandler.isInsufficient(numbers[i]) == expected[i];
            } catch (AssertionError e) {
                expectedErrorCount++;
            }

            try {
                assert gradeHandler.isInsufficient(numbers[i]) == !expected[i];
                unexpectedErrorCount++;
            } catch (AssertionError e) {/**/}
        }
        System.out.println("Test success case - is insufficient => " + (expectedErrorCount == 0 ? "successful" : "failed") + '!');
        System.out.println("Test fail case - is insufficient => "  + (unexpectedErrorCount == 0 ? "successful" : "failed") + '!');
    }

    private void test_sumOfArrayElements(Grades gradeHandler) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int expectedResult   = 55;
        int unexpectedResult = 54;

        try {
            assert gradeHandler.sumOfArrayElements(numbers) == expectedResult;
            System.out.println("Test success case - sum of array elements => successful!");
        } catch (AssertionError e) {
            System.out.println("Test success case - sum of array elements => failed!");
        }
        try {
            assert gradeHandler.sumOfArrayElements(numbers) == unexpectedResult;
            System.out.println("Test fail case - sum of array elements => failed!");
        } catch (AssertionError e) {
            System.out.println("Test fail case - sum of array elements => successful!");
        }
    }

}
