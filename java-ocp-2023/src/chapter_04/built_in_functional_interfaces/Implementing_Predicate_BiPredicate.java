package chapter_04.built_in_functional_interfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by Syed Wajahat on 12/17/2019.
 */
public class Implementing_Predicate_BiPredicate {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.startsWith("Wa");
        predicate.test("Wajahat");


        BiPredicate<String, String> biPredicate = (a, b) -> a.startsWith(b);
        biPredicate = String::startsWith;

        biPredicate.test("Zeeshan", "Z");


    }
}
