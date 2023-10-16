package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Budget {

    private int _budgetValue;

    public Budget(int _budgetValue) {
        this._budgetValue = _budgetValue;
    }


    private int getMinumum(ArrayList<Integer> array) {
        return array.isEmpty() ? -1 : Collections.min(array);
    }

    private int getMaximum(ArrayList<Integer> array) {
        return array.isEmpty() ? -1 : Collections.max(array);
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

    public int mostCheap(Keyboard keyboard) {
        return getMinumum(keyboard.getPriceList());
    }

    public int mostExpensive(PcAccessory pcAccessory) {
        return getMaximum(pcAccessory.getPriceList());
    }



    public int mostExpensiveAffordable(USB usb) {
        return getMaximum(fiilterPrices(usb.getPriceList()));
    }


    public int totalSpent(Keyboard keyboard, USB usb) {

        int finalPrice;
        int maxFinalPrice = -1;

        for ( int keyboardPrice: keyboard.getPriceList() ) {
            for ( int usbPrice: usb.getPriceList() ) {
                finalPrice = keyboardPrice + usbPrice;
                if ( finalPrice <= _budgetValue && maxFinalPrice < finalPrice ) {
                    maxFinalPrice =  finalPrice;
                }
            }
        }
        return maxFinalPrice;
    }
}