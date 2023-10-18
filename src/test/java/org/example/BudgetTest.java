package org.example;

import org.junit.*;

import static org.junit.Assert.*;

public class BudgetTest {

    @Test
    public void test_expected_getMinimum() throws EmptyArrayException {
        Budget budget = new Budget(50);
        int[] array = {100, 40, 5, 20, 57};
        int result = budget.getMinimum(array);
        assertEquals(5, result);
    }

    @Test
    public void test_unexpected_getMinimum() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, () -> budget.getMinimum(new int[]{}));
    }

    @Test
    public void test_expected_getMaximum() throws EmptyArrayException {
        Budget budget = new Budget(50);
        int[] array = {100, 40, 5, 20, 101, 57};
        int result = budget.getMaximum(array);
        assertEquals(101, result);
    }

    @Test
    public void test_unexpected_getMaximum() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, () -> budget.getMaximum(new int[]{}));
    }

    @Test
    public void test_expected_nrPricesLessThanBudget() throws EmptyArrayException {
        Budget budget = new Budget(50);
        int[] array = {100, 40, 5, 20, 57};
        int result = budget.nrPricesLessThanBudget(array);
        assertEquals(3, result);
    }

    @Test
    public void test_unexpected_nrPricesLessThanBudget() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, () -> budget.nrPricesLessThanBudget(new int[]{}));
    }

    @Test
    public void test_expected_filterPrices() throws EmptyArrayException {
        Budget budget = new Budget(50);
        int[] array = {100, 40, 5, 20, 57};
        int[] result = budget.filterPrices(array);
        assertArrayEquals(new int[]{40, 5, 20}, result);
    }

    @Test
    public void test_unexpected_filterPrices() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, () -> budget.filterPrices(new int[]{}));
    }

    @Test
    public void test_expected_mostCheap() throws EmptyArrayException {
        Budget budget = new Budget(50);
        int result = budget.mostCheap(new Keyboard(50, 20, 3, 15));
        assertEquals(3, result);
    }

    @Test
    public void test_unexpected_mostCheap() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, () -> budget.mostCheap(new Keyboard()));
    }

    @Test
    public void test_expected_mostExpensive() throws EmptyArrayException {
        Budget budget = new Budget(50);
        int result = budget.mostExpensive(new Keyboard(50, 20, 70, 30, 15));
        assertEquals(70, result);
    }

    @Test
    public void test_unexpected_mostExpensive() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, () -> budget.mostExpensive(new PcAccessory()));
    }

    @Test
    public void test_expected_mostExpensiveAffordable() throws EmptyArrayException {
        Budget budget = new Budget(60);
        int result = budget.mostExpensiveAffordable(new USB(50, 20, 58, 59, 61, 70, 30, 15));
        assertEquals(59, result);
    }

    @Test
    public void test_unexpected_mostExpensiveAffordable() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, () -> budget.mostExpensiveAffordable(new USB()));
    }

    @Test
    public void test_expected_totalSpent() throws EmptyArrayException {
        Budget budget = new Budget(57);
        int result1 = budget.totalSpent(new Keyboard(10, 20, 35, 45), new USB(10, 15, 20, 25));
        assertEquals(55, result1);
        int result2 = budget.totalSpent(new Keyboard(50, 60, 75, 85), new USB(10, 15, 20, 25));
        assertEquals(-1, result2);
    }

    @Test
    public void test_unexpected_totalSpent() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, () -> budget.totalSpent(new Keyboard(), new USB()));
    }
}