package labor_1;

import labor_1.tests.*;

public class Main {
    public static void main(String[] args) {
        TestGrades testGrades = new TestGrades();
        TestArray testArray   = new TestArray();
        TestNumbersAsArray testNumbersAsArray = new TestNumbersAsArray();
        testGrades.runTests();
        testArray.runTests();
        testNumbersAsArray.runTests();
    }
}