package chapter_07.working_with_parallel_streams.processing_parallel_reductions.combine_results_collect;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/31/2019.
 * It takes a collector input in the collect method
 */
public class OneArgumentCollect {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("W", "O", "L", "F").parallel();
        Set<String> stringSet = stringStream.collect(Collectors.toSet());

        System.out.println(stringSet);
    }
}
