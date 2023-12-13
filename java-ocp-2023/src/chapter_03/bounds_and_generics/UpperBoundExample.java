package chapter_03.bounds_and_generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/15/2019.
 */
public class UpperBoundExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        System.out.println(addNumber(list));
    }

    private static long addNumber(List<? extends Number> list) {
        long count = 0;
        for (Number number : list) {
            count += number.longValue();
        }

        return count;
    }
}
