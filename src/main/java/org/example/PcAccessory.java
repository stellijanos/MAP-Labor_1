package org.example;

import java.util.ArrayList;

public abstract class PcAccessory {

    protected ArrayList<Integer> _priceList = new ArrayList<>();

    public PcAccessory(int...prices) {
        for (int price : prices) {
            if (price >= 0 )
                _priceList.add(price);
        }
    }

    public ArrayList<Integer> getPriceList() {
        return _priceList;
    }

    public void addToPriceList(int price) {
        _priceList.add(price);
    }
}