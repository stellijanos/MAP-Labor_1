package labor_1.classes;

import java.util.ArrayList;
import java.util.Collections;

public class USB extends PcAccessory {


    private ArrayList<Integer> fiilterPrices(int buget) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int price : _priceList) {
            if (price <= buget) {
                result.add(price);
            }
        }
        return result;
    }

    public int mostExpensiveAffordable(int buget) {
        return Collections.max(fiilterPrices(buget));
    }
}
