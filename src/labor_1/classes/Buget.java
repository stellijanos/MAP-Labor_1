package labor_1.classes;

import java.util.ArrayList;
import java.util.Collections;

public class Buget {

    private int _bugetValue;


    private int getMinumum(ArrayList<Integer> array) {
        return array.isEmpty() ? -1 : Collections.min(array);
    }

    private int getMaximum(ArrayList<Integer> array) {
        return array.isEmpty() ? -1 : Collections.min(array);
    }

    private ArrayList<Integer> fiilterPrices(ArrayList<Integer> priceList) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int price : priceList) {
            if (price <= _bugetValue)
                result.add(price);
        }
        return result;
    }

    public int get_bugetValue() {
        return _bugetValue;
    }

    public void set_bugetValue(int _bugetValue) {
        this._bugetValue = _bugetValue;
    }

    public int mostCheap(Keyboard keyboard) {
        return getMinumum(keyboard.getPriceList());
    }

    public int mostExpensiveAffordable(USB usb) {
        return getMaximum(fiilterPrices(usb.getPriceList()));
    }

}
