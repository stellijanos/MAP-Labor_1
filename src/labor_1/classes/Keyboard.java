package labor_1.classes;

import java.util.Collections;

public class Keyboard extends PcAccessory {
    public int mostCheap() {
        return Collections.min(_priceList);
    }
}
