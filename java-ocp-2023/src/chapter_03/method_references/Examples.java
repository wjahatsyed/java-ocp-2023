package chapter_03.method_references;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class Examples {
    /*
    Using Predicate, Consumer and Supplier
    Predicate takes 1 parameter and returns boolean
    Consumer takes 1 parameter and returns void
     */

    public static void main(String[] args) {
        Consumer<List<Integer>> listConsumer = l -> Collections.sort(l);

        listConsumer = Collections::sort;

        String str = "Wajahat";
        Predicate<String> stringPredicate = s -> str.startsWith(s);
        stringPredicate = str::startsWith;

        Predicate<String> stringPredicate1 = s -> s.isEmpty();
        stringPredicate1 = String::isEmpty;

        Supplier<ArrayList> supplier = () -> new ArrayList();
        supplier = ArrayList::new;
    }
}
