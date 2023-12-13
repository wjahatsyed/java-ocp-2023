package chapter_04.using_streams.creating_stream_sources;

import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/18/2019.
 */
public class InFiniteStreams {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        oddNumbers.limit(5).forEach(System.out::println);

        Stream<String> stringStream = Stream.iterate("a", i -> i + "a");
        stringStream.limit(5).forEach(System.out::println);

    }

}
