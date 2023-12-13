package chapter_03.method_references;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/16/2019.
 * replaceAll is a method in List interface
 */
public class Using_Replace_All {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,4,6);
        integerList.replaceAll(x -> x*2);
        System.out.print(integerList);
    }
}
