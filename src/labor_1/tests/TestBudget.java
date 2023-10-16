package labor_1.tests;

import labor_1.classes.Budget;
import labor_1.classes.Keyboard;

public class TestBudget {
    public void runTests() {

        System.out.println("\n\nTests for Problem 4 - Budget\n");

        test_mostCheap();
        test_mostExpensive();
        test_mostExpensiveAffordable();
        test_buyPcAccessories();
    }

    private void test_mostCheap() {
        Budget budget = new Budget(50);
        int result = budget.mostCheap(new Keyboard(100, 20, 30, 25, 50));
        int expected = 20;
        int unexpected = 25;

        try {
            assert result == expected;
            System.out.println("Test success case - most cheap => successful!");
        } catch (AssertionError e) {
            System.out.println("Test success case - most cheap => failed!");
        }

        try {
            assert result == unexpected;
            System.out.println("Test fail case - most cheap => failed!");
        } catch (AssertionError e) {
            System.out.println("Test fail case - most cheap => successful!");
        }
    }

    private void test_mostExpensive() {
    }



    private void test_mostExpensiveAffordable() {

    }

    private void test_buyPcAccessories() {

    }

}
