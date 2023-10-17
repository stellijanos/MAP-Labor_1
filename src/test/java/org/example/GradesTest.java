package org.example;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
}
