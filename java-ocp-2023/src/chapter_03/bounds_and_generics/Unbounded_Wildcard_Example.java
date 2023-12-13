package chapter_03.bounds_and_generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/15/2019.
 */
public class Unbounded_Wildcard_Example {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stringList.add(i + " Number");
        }
        printList(stringList);

        List<Integer> integerList = new ArrayList<>();
        int j = 1;
        while (j < 6) {
            integerList.add(j);
            j++;
        }
        printList(integerList);
    }

    private static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
