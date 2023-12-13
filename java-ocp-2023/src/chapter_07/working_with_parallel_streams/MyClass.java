package chapter_07.working_with_parallel_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * streams support concurrency API
 * Parallel streams improves the performance
 * Number of threads in a parallel stream is equal to the number of CPUs available
 * parallel() and parallelStream()
 * parallelStream is for Collections
 */
public class MyClass {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        //parallel is an intermediate operation
        Stream<Integer> parallelStream1 = integerStream.parallel();
        parallelStream1.forEach(System.out::println);

        List<Integer> list = Arrays.asList(1, 2, 5, 7);
        Stream<Integer> integerStream1 = list.parallelStream();

        /*
        concat method on streams creates parallel streams if one of them is parallel
        flatMap() creates a stream that is not parallel even the underlying stream was parallel
         */


    }
}
