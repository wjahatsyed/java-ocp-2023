package chapter_07.working_with_parallel_streams.processing_parallel_reductions;

import java.util.Arrays;

/**
 * Created by Syed Wajahat on 12/31/2019.
 * findAny() is non reduction terminal operation
 * findFirst(), limit() and skip() are slow performers on parallel stream
 */
public class PPR {
    public static void main(String[] args) {
        //The result is predictable as it will always be 1
        System.out.println(
                Arrays.asList(1, 2, 3, 4, 5, 6).stream().findAny().get());

        //The result here is not predictable
        System.out.println(
                Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().findAny().get()
        );

        //ordered serial to unordered
        Arrays.asList(1, 2, 3, 4, 5, 6).stream().unordered();

        //ordered serial to parallel and unordered
        //good performance improvement
        Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().unordered();
    }
}
