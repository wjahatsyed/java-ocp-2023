package chapter_03.method_references;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class Use_ForEach {
    public static void main(String[] args) {
        List<String> cats = Arrays.asList("Choti Cat", "Moti Cat");
        cats.forEach(s-> System.out.println(s));
        cats.forEach(System.out::println);
    }
}
