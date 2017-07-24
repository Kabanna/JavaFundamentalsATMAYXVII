package ua.org.oa.lecture8;

import java.util.Comparator;

/**
 * Created by dmitr on 24.07.2017.
 */
public class ClothComparator implements Comparator<Clothing>{
    @Override
    public int compare(Clothing o1, Clothing o2) {
        int result = o1.getClass().getName().compareTo(o2.getClass().getName());
        if (result == 0) {
            result = o1.getPrice() - o2.getPrice();
        }
        return result;
    }
}
