package chapter_07.working_with_parallel_streams.avoiding_stateful_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/31/2019.
 * Stateful operation is the one that the state of a lambda expression
 * can change during execution of a pipeline
 */
public class ASO_Example {
    public static void main(String[] args) {
        //stateful expression must be avoided in parallel and serial streams as much as possible
        List<Integer> list = new ArrayList<>();
        Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().map(s -> {
            list.add(s); return s;
        }).forEachOrdered(s-> System.out.print(s + " "));

        System.out.println();
        for(int i: list){
            System.out.print(i + " ");
        }
    }
}
