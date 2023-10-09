package labor_1.tests;
import labor_1.classes.Grades;
import java.util.ArrayList;
import java.util.Arrays;

public class TestGrades {
    public void runTests() {
        Grades gradeHandler = new Grades();

        System.out.println("Tests for Problem 1 - Grades\n");

        test_nextMultipleOf5(gradeHandler, 0, 0);
        test_isInsufficient(gradeHandler, 0, 0);
        test_insufficientGrades(gradeHandler, 0, 0);
        test_sumOfArrayElements(gradeHandler);
        test_averageGrade(gradeHandler, 0 ,0);
        test_roundedGrades(gradeHandler, 0, 0);
        test_maximalRoundedGrade(gradeHandler, 0, 0);
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

    private void test_insufficientGrades(Grades gradeHandler, int expectedErrorCount, int unexpectedErrorCount) {
        ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(0, 34, 35, 36, 37, 38, 39, 40, 41, 42));
        ArrayList<Integer> result = gradeHandler.insufficientGrades(grades);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 34, 35, 36, 37));
        ArrayList<Integer> unexpected = new ArrayList<>(Arrays.asList(38, 39, 40, 41, 42));

        for (int i = 0; i < result.size(); i++) {
            try {
                assert result.get(i).equals(expected.get(i));
            } catch (AssertionError e) {
                expectedErrorCount++;
            }
            try {
                assert result.get(i).equals(unexpected.get(i));
                unexpectedErrorCount++;
            } catch (AssertionError e) {/**/}
        }

        grades.clear();
        result = gradeHandler.insufficientGrades(grades);
        expected.clear();

        try {
            assert result.isEmpty();
        } catch (AssertionError e) {
            expectedErrorCount++;
        }
        try {
            assert result.size() == 1;
            unexpectedErrorCount++;
        } catch (AssertionError e) {/**/}

        grades.add(38);
        grades.add(39);
        grades.add(40);

        result = gradeHandler.insufficientGrades(grades);

        try {
            assert result.isEmpty();
        } catch (AssertionError e) {
            expectedErrorCount++;
        }
        try {
            assert !result.isEmpty();
            unexpectedErrorCount++;
        } catch (AssertionError e) {/**/}

        System.out.println("Test success case - insufficient grades => " + (expectedErrorCount == 0 ? "successful" : "failed") + '!');
        System.out.println("Test fail case - insufficient grades => "  + (unexpectedErrorCount == 0 ? "successful" : "failed") + '!');

    }

    private void test_sumOfArrayElements(Grades gradeHandler) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int expected   = 55;
        int unexpected = 54;

        try {
            assert gradeHandler.sumOfArrayElements(numbers) == expected;
            System.out.println("Test success case - sum of array elements => successful!");
        } catch (AssertionError e) {
            System.out.println("Test success case - sum of array elements => failed!");
        }
        try {
            assert gradeHandler.sumOfArrayElements(numbers) == unexpected;
            System.out.println("Test fail case - sum of array elements => failed!");
        } catch (AssertionError e) {
            System.out.println("Test fail case - sum of array elements => successful!");
        }
    }

    private void test_averageGrade(Grades gradeHandler, int expectedErrorCount, int unexpectedErrorCount) {
        ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(33, 75, 100, 90, 0));
        int result = gradeHandler.averageGrade(grades);
        int expected  = 59;
        int unexpected = 75;

        try {
            assert result == expected;
        } catch (AssertionError e) {
            expectedErrorCount++;
        }
        try {
            assert result == unexpected;
            unexpectedErrorCount++;
        } catch (AssertionError e) {/**/}

        grades.clear();
        result = gradeHandler.averageGrade(grades);

        try {
            assert result == 0;
        } catch (AssertionError e) {
            expectedErrorCount++;
        }
        try {
            assert !(result == 0);
            unexpectedErrorCount++;
        } catch (AssertionError e) {/**/}

        System.out.println("Test success case - insufficient grades => " + (expectedErrorCount == 0 ? "successful" : "failed") + '!');
        System.out.println("Test fail case - insufficient grades => "  + (unexpectedErrorCount == 0 ? "successful" : "failed") + '!');
    }

    private void test_roundedGrades(Grades gradeHandler, int expectedErrorCount, int unexpectedErrorCount) {

        ArrayList<Integer> grades     = new ArrayList<>(Arrays.asList(0, 10, 21, 32, 43, 54, 65, 76, 87, 98, 100));
        ArrayList<Integer> result     = gradeHandler.roundedGrades(grades);
        ArrayList<Integer> expected   = new ArrayList<>(Arrays.asList(0, 10, 21, 32, 45, 55, 65, 76, 87, 100, 100));
        ArrayList<Integer> unexpected = new ArrayList<>(Arrays.asList(5, 15, 20, 30, 40, 50, 70, 80, 90, 95, 105));

        for (int i = 0; i < result.size(); i++) {
            try {
                assert result.get(i).equals(expected.get(i));
            } catch (AssertionError e) {
                expectedErrorCount++;
            }
            try {
                assert result.get(i).equals(unexpected.get(i));
                unexpectedErrorCount++;
            } catch (AssertionError e) {/**/}
        }
        System.out.println("Test success case - rounded grades => " + (expectedErrorCount == 0 ? "successful" : "failed") + '!');
        System.out.println("Test fail case - rounded grades => "  + (unexpectedErrorCount == 0 ? "successful" : "failed") + '!');
    }

    private void test_maximalRoundedGrade(Grades gradeHandler, int expectedErrorCount, int unexpectedErrorCount) {
        ArrayList<Integer> grades = new ArrayList<Integer>(Arrays.asList(7, 34, 69, 93, 96, 10, 45, 30));
        int result = gradeHandler.maximalRoundedGrade(grades);
        int expected = 95;
        int unexpected = 96;

        try {
            assert result == expected;
        } catch (AssertionError e) {
            expectedErrorCount++;
        }
        try {
            assert result == unexpected;
            unexpectedErrorCount++;
        } catch (AssertionError e) {/**/}

        System.out.println("Test success case - maximal rounded grade => " + (expectedErrorCount == 0 ? "successful" : "failed") + '!');
        System.out.println("Test fail case - maximal rounded grade => "  + (unexpectedErrorCount == 0 ? "successful" : "failed") + '!');
    }
}
