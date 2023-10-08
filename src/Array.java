import java.util.ArrayList;

public class Array {
    public int minimalNumber(ArrayList<Integer> array) {
        int minimalNumber = array.get(0);
        for (Integer number: array)
            if (minimalNumber > number)
                minimalNumber = number;
        return minimalNumber;
    }

    public int maximalNumber(ArrayList<Integer> array) {
        int maximalNumber = array.get(0);
        for (Integer number: array)
            if (maximalNumber < number)
                maximalNumber = number;
        return maximalNumber;
    }

}
