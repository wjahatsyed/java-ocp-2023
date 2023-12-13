package chapter_04.using_streams.using_common_intermediate_operations;

import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class Use_Limit_And_Skip {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.iterate(1, n -> n + 1);
        integerStream.skip(5).limit(2).forEach(System.out::println);
        System.out.println(integerStream.isParallel());


    }
}
