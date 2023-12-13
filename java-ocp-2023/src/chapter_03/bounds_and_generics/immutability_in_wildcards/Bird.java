package chapter_03.bounds_and_generics.immutability_in_wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/15/2019.
 *
 */
public class Bird {
}

class Sparrow extends Bird {
    public static void main(String[] args) {
        List<? extends Bird> list = new ArrayList<>();
        //both below lines do not compile
        //list.add(new Bird());
        //list.add(new Sparrow());
    }
}
