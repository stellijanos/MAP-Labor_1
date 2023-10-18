package org.example;


public class Budget {

    private final int _budgetValue;

    public Budget(int _budgetValue) {
        this._budgetValue = _budgetValue;
    }

    private int getMinumum(int[] array) throws EmptyArrayException {
        if (array.length == 0 ) {
            throw new EmptyArrayException("Arary is empty!");
        }
        int minimum = array[0];
        for (int number: array)
            if (minimum > number)
                minimum = number;
        return minimum;
    }

    private int getMaximum(int[] array) throws EmptyArrayException {
        if (array.length == 0 ) {
            throw new EmptyArrayException("Arary is empty!");
        }
        int maximum = array[0];
        for (int number: array)
            if (maximum < number)
                maximum = number;
        return maximum;
    }

    private int nrPricesLessThanBudget(int[] priceList) throws EmptyArrayException {
        if (priceList.length == 0) {
            throw new EmptyArrayException("Array is empty!");
        }
        int result = 0;
        for (int price : priceList)
            if (price <= _budgetValue)
                result ++;
        return result;
    }

    private int[] fiilterPrices(int[] priceList) throws EmptyArrayException {
        if (priceList.length == 0) {
            throw new EmptyArrayException("Array is empty!");
        }
        int[] result = new int[nrPricesLessThanBudget(priceList)];
        int index = 0;
        for (int price : priceList)
            if (price <= _budgetValue) {
                result[index] = price;
                index ++;
            }
        return result;
    }

    public int mostCheap(Keyboard keyboard) throws EmptyArrayException {
        return getMinumum(keyboard.getPriceList());
    }

    public int mostExpensive(PcAccessory pcAccessory) throws EmptyArrayException {
        return getMaximum(pcAccessory.getPriceList());
    }

    public int mostExpensiveAffordable(USB usb) throws EmptyArrayException {
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