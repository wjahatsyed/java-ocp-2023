package chapter_03.legacy_code;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/15/2019.
 */
public class Legacy_autoboxing {
    public static void main(String[] args){
        List list = new ArrayList<>();
        list.add(5);
        //compile time error

        //int i = list.get(0);
    }
}
