package labor_1.classes;

import java.util.ArrayList;
import java.util.Collections;

public class Buget {

    private int _budgetValue;


    private int getMinumum(ArrayList<Integer> array) {
        return array.isEmpty() ? -1 : Collections.min(array);
    }

    private int getMaximum(ArrayList<Integer> array) {
        return array.isEmpty() ? -1 : Collections.min(array);
    }

    private ArrayList<Integer> fiilterPrices(ArrayList<Integer> priceList) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int price : priceList) {
            if (price <= _budgetValue)
                result.add(price);
        }
        return result;
    }

    public int get_budgetValue() {
        return _budgetValue;
    }

    public void set_budgetValue(int _budgetValue) {
        this._budgetValue = _budgetValue;
    }

    public int mostExpensive(PcAccessory pcAccessory) {
        return getMaximum(pcAccessory.getPriceList());
    }

    public int mostCheap(Keyboard keyboard) {
        return getMinumum(keyboard.getPriceList());
    }

    public int mostExpensiveAffordable(USB usb) {
        return getMaximum(fiilterPrices(usb.getPriceList()));
    }


    public int buyPcAccessories(Keyboard keyboard, USB usb) {

        int initialBudget = _budgetValue;
        int keyboardPrice = 0;
        int usbPrice = 0;

        for ( int price: usb.getPriceList() ) {
            if (price < initialBudget ) {
                keyboardPrice = price;
                _budgetValue -= keyboardPrice;
                usbPrice = mostExpensiveAffordable(usb);
                if ( usbPrice <= _budgetValue) {
                    return keyboardPrice + usbPrice;
                }
                _budgetValue = initialBudget;
            }
        }
        return -1;
    }
}


