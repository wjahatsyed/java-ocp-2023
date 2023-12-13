package chapter_07.working_with_parallel_streams.processing_parallel_reductions.combine_results_collect;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/31/2019.
 * Requirements for parallel streams to work with collect()
 * The stream has to be parallel
 * The input parameter to the collect method must be unordered and concurrent
 */
public class Requirements {
    public static void main(String[] args) {
        //Use Collectors.toConcurrentMap and Collectors.groupingByConcurrent()
        //comma separated based on length
        Stream<String> stringStream = Stream.of("Beer", "Tiger", "Lion").parallel();
        ConcurrentMap<Integer, String> concurrentMap = stringStream.collect(
                Collectors.toConcurrentMap(String::length, k -> k, (a, b) -> a + "," + b)
        );

        System.out.println(concurrentMap);
        System.out.println(concurrentMap.getClass());

        //groupingBy with parallel stream and parallel reduction
        Stream<String> stringStream1 = Stream.of("Beer", "Tiger", "Lion").parallel();
        ConcurrentMap<Integer, List<String>> integerListConcurrentMap = stringStream1.collect(
                Collectors.groupingByConcurrent(String::length));
        System.out.println(integerListConcurrentMap);
        System.out.println(integerListConcurrentMap.getClass());

    }
}
