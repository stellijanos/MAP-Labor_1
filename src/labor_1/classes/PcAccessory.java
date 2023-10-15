package labor_1.classes;
import java.util.Collections;

public abstract class PcAccessory {

    protected int[]_priceList = new int[]{};


    public PcAccessory(int...prices) {
        _priceList = prices;
    }

    public int[] getPriceList() {
        return _priceList;
    }

}
