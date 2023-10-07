
public class TestGrades {
    public void runTests() {
        Grades gradeHandler = new Grades();
        test_nextMultipleOf5(gradeHandler);
        test_round(gradeHandler);
    }

    public void test_nextMultipleOf5(Grades gradeHandler) {
        int[] numbers = {0, 10, 21, 32, 43, 54, 65, 76, 87, 98, 100};
        int[] expected = {5, 15, 25, 35, 45, 55, 70, 80, 90, 100, 105};
        int[] unexpected = {0, 10, 20, 30, 40, 50, 65, 75, 85, 95, 100};

        boolean failed = false;

        for (int i = 0; i < numbers.length; i++) {
            try {
                assert gradeHandler.nextMultipleOf5(numbers[i]) == expected[i];
            } catch (AssertionError e) {
                failed = true;
            }
        }
        System.out.println( "Test success case - multiple of 5 " + (failed ? "failed" : "successful") + '!');

        failed = true;

        for (int i = 0; i< numbers.length; i++) {
            try {
                assert gradeHandler.nextMultipleOf5(numbers[i]) == expected[i];
                failed = false;
            } catch (AssertionError e) {/**/}
        }
        System.out.println("Test fail case - multiple of 5 "  + (failed ? "failed" : "successful") + '!');
    }

    public void test_round(Grades gradeHandler) {

        int[] numbers = {0, 10, 21, 32, 43, 54, 65, 76, 87, 98, 100};
        int[] expected = {};
        int[] unexpected = {};
    }

}
