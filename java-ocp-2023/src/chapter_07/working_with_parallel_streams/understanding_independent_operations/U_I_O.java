package chapter_07.working_with_parallel_streams.understanding_independent_operations;

import java.util.Arrays;

/**
 * Created by Syed Wajahat on 12/31/2019.
 * The property of elements in an stream to be executed independently improves
 * the performance of parallel streams. map(), forEach() and filter() are some examples
 * The order is not guaranteed in parallel streams
 */
public class U_I_O {
    public static void main(String[] args) {
        Arrays.asList("wajahat", "zeeshan").parallelStream().map(s -> s.toUpperCase()).forEach(System.out::println);

        //Another example
        Arrays.asList("wajahat", "ahmer").parallelStream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        }).forEach(System.out::println);

    }
}
