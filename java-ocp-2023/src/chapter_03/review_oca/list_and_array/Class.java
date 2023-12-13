package chapter_03.review_oca.list_and_array;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/14/2019.
 */
public class Class {
    public static void main(String[] args) {
        //Remember concept of backed data
        String[] array = {"Wajahat", "Zeeshan"};
        List<String> list = Arrays.asList(array);
        list.set(0, "Ahmer");
        System.out.println(list);
        array[1] = "Zeeshu baba";
        System.out.println(list);
        //Throws UnsupportedOperationException
        list.remove(1);
    }


}
