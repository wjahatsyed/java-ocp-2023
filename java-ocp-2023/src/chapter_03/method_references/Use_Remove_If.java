package chapter_03.method_references;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class Use_Remove_If {
    /*
    remove if works with Predicate
    removeIf is a method in Collection interface
     */

    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();
        stringList.add("Wajahat");
        stringList.add("Ahmer");

        stringList.removeIf(s->s.startsWith("A"));

        System.out.println(stringList);
    }
}
