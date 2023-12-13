package chapter_03.review_oca.searching_and_sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/14/2019.
 */
public class MyClass {
    public static void main(String[] args) {
        int[] array = {6, 9, 8, 1};
        Arrays.sort(array);
        //{1,6,8,9}
        System.out.println(Arrays.binarySearch(array, 1));
        System.out.println(Arrays.binarySearch(array, 3));
        //3 can be inserted at index 1 (negate index 1 and then subtract 1)
        //It will print -2

        List<Integer> list = Arrays.asList(9, 7, 5, 3);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 3));
        System.out.println(Collections.binarySearch(list, 2));


    }
}
