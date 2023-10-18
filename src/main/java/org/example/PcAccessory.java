package org.example;


public class PcAccessory {

    protected int[] _priceList;

    public PcAccessory(int...prices) {
        _priceList = prices;
    }

    public int[] getPriceList() {
        return _priceList;
    }
}
