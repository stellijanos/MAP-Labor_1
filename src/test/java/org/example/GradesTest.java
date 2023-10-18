package org.example;
import org.junit.*;

import static org.junit.Assert.*;

public class GradesTest {

    @Test
    public void test_expected_nextMultipleOf5() throws IllegalNumberException {
        Grades grades = new Grades(0, 10, 21, 32, 43, 54, 65, 76, 87, 98, 100);
        int[] expected   = {5, 15, 25, 35, 45, 55, 70, 80, 90, 100, 105};

        for (int i = 0; i< expected.length; i++) {
            assertEquals(expected[i], grades.nextMultipleOf5(grades.get_grades()[i]));
        }
    }

    @Test
    public void test_unexpected_nextMultipleOf5() {
        Grades grades = new Grades();

        final int unexpected1 = -1;
        assertThrows(IllegalNumberException.class, () -> grades.nextMultipleOf5(unexpected1));

        final int unexpected2 = 101;
        assertThrows(IllegalNumberException.class, () -> grades.nextMultipleOf5(unexpected2));
    }

    @Test
    public void test_expected_insufficientGrades() throws IllegalNumberException, EmptyArrayException {
        Grades grades = new Grades(0, 34, 35, 36, 37, 38, 39, 40, 41, 42);
        int[] result = grades.insufficientGrades();

        assertArrayEquals(new int[]{0, 34, 35, 36, 37}, result);
    }

    @Test
    public void test_unexpected_insufficientGrades() {
        Grades grades = new Grades();
        assertThrows(EmptyArrayException.class, grades::insufficientGrades);
    }

    @Test
    public void test_expected_averageGrade() throws EmptyArrayException {
        Grades grades = new Grades(0, 10, 21, 32, 43, 54, 65, 76, 87, 98, 100);
        int result = grades.averageGrade();
        assertEquals(53, result);
    }

    @Test
    public void test_unexpected_averageGrade() {
        Grades grades = new Grades();
        assertThrows(EmptyArrayException.class, grades::averageGrade);
    }

    @Test
    public void test_expected_roundedGrades() throws IllegalNumberException, EmptyArrayException {
        Grades grades = new Grades(0, 10, 21, 32, 43, 54, 65, 76, 87, 98, 100);
        int[] result = grades.roundedGrades();

        assertArrayEquals(new int[]{0, 10, 21, 32, 45, 55, 65, 76, 87, 100, 100}, result);
    }

    @Test
    public void test_unexpected_roundedGrades() {
        Grades grades = new Grades();
        assertThrows(EmptyArrayException.class, grades::roundedGrades);
    }

    @Test
    public void test_expected_maximalRoundedGrade() throws IllegalNumberException, EmptyArrayException {
        Grades grades = new Grades(0, 10, 21, 32, 43, 54, 65, 76, 87);
        int result = grades.maximalRoundedGrade();

        assertEquals(55, result);
    }

    @Test
    public void test_unexpected_maximalRoundedGrade() {
        Grades grades = new Grades();
        assertThrows(EmptyArrayException.class, grades::maximalRoundedGrade);
    }
}
