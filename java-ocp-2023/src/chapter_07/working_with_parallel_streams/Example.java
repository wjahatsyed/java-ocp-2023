package chapter_07.working_with_parallel_streams;

import java.util.Arrays;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * results of a serial stream are ordered
 * Let's talk about parallel streams now
 * The results of the parallel stream are not ordered that's why not sorted.
 * A parallel stream in this scenario is like submitting multiple lambda expressions of Runnable
 * as tasks to a fixed thread pool where each task is executed by a separate thread concurrently.
 */
public class Example {
    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 4, 5).stream().forEach(System.out::print);
        System.out.println();
        Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().forEach(s -> System.out.print(s + " "));
        System.out.println();
        //forEachOrdered is forcing to order the results at the cost of performance
        Arrays.asList(1,2,3,4,6).parallelStream().forEach(s-> System.out.print(s + " "));


    }
}
