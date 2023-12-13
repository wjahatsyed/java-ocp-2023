package chapter_07.working_with_parallel_streams.processing_parallel_reductions.reduce_combine_results;

import java.util.Arrays;

/**
 * Created by Syed Wajahat on 12/31/2019.
 * Parallel streams are only supported by Three Argument reduce method
 * which separately takes 1 input of identity, 1 input of BiFunction accumulator
 * and one input of BinaryOperator combiner
 */
public class UseThreeArgument {
    public static void main(String[] args) {
        String s = Arrays.asList("W", "a", "j", "a", "h", "a", "t")
                .parallelStream()
                .reduce("", (c, s1) -> c + s1, (s2, s3) -> s2 + s3);
        System.out.print(s);

    }
}
