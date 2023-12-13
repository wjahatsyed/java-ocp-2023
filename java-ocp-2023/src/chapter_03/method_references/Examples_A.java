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
public class Examples_A {
    public static void main(String[] args) {
        /*
        Use Predicate, Consumer and Supplier
         */

        //Predicate takes 1 Parameter and returns boolean
        String s = "Wajahat";
        //Lambda
        Predicate<String> stringPredicate = s1 -> s.startsWith(s1);
        //Method Reference
        stringPredicate = s::startsWith;

        //Consumer - takes 1 parameter and returns void
        //Lambda
        Consumer<List<Integer>> listConsumer = l -> Collections.sort(l);
        //Method Reference
        listConsumer = Collections::sort;

        //Supplier - takes 0 parameter and retuns anything
        //Lambda
        Supplier<ArrayList> listSupplier = () -> new ArrayList();
        //Method Reference
        listSupplier = ArrayList::new;


    }
}
