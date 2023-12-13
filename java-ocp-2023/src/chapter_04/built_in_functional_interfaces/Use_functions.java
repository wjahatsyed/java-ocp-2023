package chapter_04.built_in_functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by Syed Wajahat on 12/17/2019.
 */
public class Use_functions {
    /*
    java.util.function
     */

    public static void main(String[] args) {
        //Supplier takes 0 parameter and returns T
        Supplier<ArrayList> listSupplier = ArrayList::new;
        List list = listSupplier.get();

        //Consumer takes 1 parameter and returns void
        Consumer<List<Integer>> listConsumer = Collections::sort;
        listConsumer.accept(Arrays.asList(6,4,2,9));




    }
}
