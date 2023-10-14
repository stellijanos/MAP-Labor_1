package labor_1.classes;
import java.util.ArrayList;
import java.util.Collections;

public abstract class PcAccessory {
    protected final ArrayList<Integer> _priceList = new ArrayList<>();

    public void addIntoPriceList(int price) {
        _priceList.add(price);
    }

    public ArrayList<Integer> priceList() {
        return _priceList;
    }

    public int mostExpensive() {
        return Collections.max(_priceList);
    }

}
