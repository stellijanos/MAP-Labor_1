package org.example;
import org.junit.*;

import static org.junit.Assert.*;


public class ArrayTest {

    @Test
    public void test_expected_minimalNumber() throws EmptyArrayException {
        Array numbers = new Array(40, 55, 60, 3, 90, 87, 69, 43);
        int result = numbers.minimalNumber();
        int expected = 3;

        assertEquals(expected, result);
    }

    @Test
    public void test_unexpected_minimalNumber() {
        Array numbers = new Array();
        assertThrows(EmptyArrayException.class, numbers::minimalNumber);
    }

    @Test
    public void test_expected_maximalNumber() throws EmptyArrayException {
        Array numbers = new Array(40, 55, 60, 3, 90, 87, 69, 43);
        int result = numbers.maximalNumber();
        int expected = 90;

        assertEquals(expected, result);
    }

    @Test
    public void test_unexpected_maximalNumber() {
        Array numbers = new Array();
        assertThrows(EmptyArrayException.class, numbers::maximalNumber);
    }

    @Test
    public void test_sumWithoutMinimalNumber() throws EmptyArrayException {
        Array numbers = new Array(40, 55, 60, 3, 90, 87, 69, 43);
        int result = numbers.sumWithoutMinimalNumber();
        int expected = 444;

        assertEquals(expected, result);
    }

    @Test
    public void test_unexpected_sumWithoutMinimalNumber() {
        Array numbers = new Array();

        assertThrows(EmptyArrayException.class, numbers::sumWithoutMinimalNumber);
    }

    @Test
    public void test_sumWithoutMaximalNumber() throws EmptyArrayException {
        Array numbers = new Array(40, 55, 60, 3, 90, 87, 69, 43);
        int result = numbers.sumWithoutMaximalNumber();
        int expected = 357;

        assertEquals(expected, result);
    }

    @Test
    public void test_unexpected_sumWithoutMaximalNumber() {
        Array numbers = new Array();

        assertThrows(EmptyArrayException.class, numbers::sumWithoutMaximalNumber);
    }
}
