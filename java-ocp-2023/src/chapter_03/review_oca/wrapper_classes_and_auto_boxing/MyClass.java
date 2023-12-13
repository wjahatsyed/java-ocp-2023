package chapter_03.review_oca.wrapper_classes_and_auto_boxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/14/2019.
 */
public class MyClass {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        //Auto box 1 and save as Integer object in ArrayList object
        list.add(1);
        list.add(3);
        list.add(5);
        list.remove(1);
        list.remove(new Integer(5));
        System.out.println(list);
    }


}
