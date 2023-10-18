package org.example;

import org.junit.*;

import static org.junit.Assert.*;

public class BudgetTest {

    @Test
    public void test_expected_getMinimum() {

    }

    @Test
    public void test_unexpected_getMinimum() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, ()-> {
            budget.getMinimum(new int[]{});
        } );
    }

    @Test
    public void test_expected_getMaximum() {

    }

    @Test
    public void test_unexpected_getMaximum() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, ()-> {
            budget.getMaximum(new int[]{});
        } );
    }

    @Test
    public void test_expected_nrPricesLessThanBudget() {

    }

    @Test
    public void test_unexpected_nrPricesLessThanBudget() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, ()-> {
            budget.nrPricesLessThanBudget(new int[]{});
        } );
    }

    @Test
    public void test_expected_filterPrices() {

    }

    @Test
    public void test_unexpected_filterPrices() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, ()-> {
            budget.filterPrices(new int[]{});
        } );
    }

    @Test
    public void test_expected_mostCheap() {

    }

    @Test
    public void test_unexpected_mostCheap() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, ()-> {
            budget.mostCheap(new Keyboard());
        } );
    }

    @Test
    public void test_expected_mostExpensive() {

    }

    @Test
    public void test_unexpected_mostExpensive() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, ()-> {
            budget.mostExpensive(new PcAccessory() {
            });
        } );
    }

    @Test
    public void test_expected_mostExpensiveAffordable() {

    }

    @Test
    public void test_unexpected_mostExpensiveAffordable() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, ()-> {
            budget.mostExpensiveAffordable(new USB() {
            });
        } );
    }

    @Test
    public void test_expected_totalSpent() {

    }

    @Test
    public void test_unexpected_totalSpent() {
        Budget budget = new Budget(50);
        assertThrows(EmptyArrayException.class, ()-> {
            budget.totalSpent(new Keyboard(), new USB());
        } );
    }

}
