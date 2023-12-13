package chapter_03.bounds_and_generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/15/2019.
 */
public class LowerBound_Example {
    public static void main(String[] args) {
        List<? super Object> objects = new ArrayList<>();
        Object o = "Sami";
        objects.add(o);
        objects.add("Wajahat");

        objects.forEach(System.out::println);
    }

}



