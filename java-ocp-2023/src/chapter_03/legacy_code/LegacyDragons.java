package chapter_03.legacy_code;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/15/2019.
 * Not using generics from caller
 */
public class LegacyDragons {
    public static void main(String[] args) {
        List unicorns = new ArrayList<>();
        unicorns.add(new Unicorn());
        print(unicorns);
    }

    private static void print(List<Dragon> dragons) {
        //The below for loop throws ClassCastException
        for(Dragon dragon: dragons){
            System.out.println(dragon);
        }
    }
}

class Unicorn {
}

class Dragon {
}
