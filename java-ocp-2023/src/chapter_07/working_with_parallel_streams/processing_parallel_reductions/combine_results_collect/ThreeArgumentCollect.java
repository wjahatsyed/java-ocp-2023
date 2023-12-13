package chapter_07.working_with_parallel_streams.processing_parallel_reductions.combine_results_collect;

import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/31/2019.
 * Use a three argument collect method with parallel stream
 * Supplier, BiConsumer (accumulator), BiConsumer (combiner)
 */
public class ThreeArgumentCollect {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> sortedSet = stringStream.collect(
                ConcurrentSkipListSet::new, Set::add, Set::addAll
        );
        System.out.println(sortedSet);
    }
}
