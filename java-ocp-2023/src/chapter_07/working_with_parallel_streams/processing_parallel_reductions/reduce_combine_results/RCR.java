package com.wajahat.ocp.chapter_7.working_with_parallel_streams.processing_parallel_reductions.reduce_combine_results;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/31/2019.
 */
public class RCR {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("w", "o", "l", "f");
        System.out.println(stringStream.reduce("", (a, b) -> a + b));

        //The accumulator takes BiFunction and combiner takes BinaryOperator
        String s = Arrays.asList("W", "A", "J", "A", "H", "A", "T").stream()
                .reduce("", (c, s1) -> c + s1, (s2, s3) -> s2 + s3);
        System.out.println(s);


    }
}
