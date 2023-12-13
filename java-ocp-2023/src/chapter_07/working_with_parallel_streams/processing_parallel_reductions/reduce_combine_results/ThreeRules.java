package com.wajahat.ocp.chapter_7.working_with_parallel_streams.processing_parallel_reductions.reduce_combine_results;

import java.util.Arrays;

/**
 * Created by Syed Wajahat on 12/31/2019.
 * When applying reduce on parallel streams, the result is not guaranteed to be ordered and accurate.
 * 3 Rules which can guarantee the result to be expected accurate and ordered
 * 1. The identity must be equal: combiner.apply(identity, u) must be u
 * 2. The accumulator must be associative and stateless
 * 3. The combiner must be associative and stateless
 */
public class ThreeRules {
    public static void main(String[] args) {
        //applying a non associative accumulator
        int i = Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .reduce(0, (a, b) -> a - b);
        System.out.println(i);

        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .reduce(0, (a, b) -> (a - b))); // NOT AN ASSOCIATIVE ACCUMULATOR
    }
}
