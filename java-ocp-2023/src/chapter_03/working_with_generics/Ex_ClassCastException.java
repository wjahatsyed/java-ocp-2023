package chapter_03.working_with_generics;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/14/2019.
 */
public class Ex_ClassCastException {
    static void printNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            //This line will throw ClassCastException
            String name = (String)list.get(i);
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new StringBuilder("Wajahat"));
        printNames(list);
    }
}
