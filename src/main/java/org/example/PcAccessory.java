package org.example;


public abstract class PcAccessory {

    protected int[] _priceList;

    public PcAccessory(int...prices) {
        _priceList = prices;
    }

    public int[] getPriceList() {
        return _priceList;
    }
}
