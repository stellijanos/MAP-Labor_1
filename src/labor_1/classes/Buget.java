package labor_1.classes;

import java.util.ArrayList;
import java.util.Collections;

public class Buget {

    private int getMinumum(int[] array) {
        int min = array.length > 0 ? array[0] : -1;
        for (int number: array) {
            min = Math.min(min, number);
        }
        return min;
    }

    private int getMaximum(int[] array) {
        int max = array.length > 0 ? array[0] : -1;
        for (int number: array) {
           max = Math.max(max, number);
        }
        return max;
    }


    public Object mostCheap(Keyboard keyboard) {
        return Collections.min(keyboard.getPriceList());
    }


    public int mostExpensiveAffordable(int buget) {
        return Collections.max(fiilterPrices(buget));
    }

    private ArrayList<Integer> fiilterPrices(int buget) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int price : _priceList) {
            if (price <= buget) {
                result.add(price);
            }
        }
        return result;
    }


}
