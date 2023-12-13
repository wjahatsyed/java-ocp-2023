package chapter_04.using_streams.creating_stream_sources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/18/2019.
 */
public class FiniteStreams {
    public static void main(String[] args) {
        //Create an empty stream
        Stream<String> empty = Stream.empty();
        //Create a stream of size 1
        Stream<Integer> integerStream = Stream.of(1);
        //Create a stream from array
        Stream<Integer> fromArray = Stream.of(1, 3, 4);

        //Make Stream from List
        List<Integer> list = Arrays.asList(1, 2, 4);
        Stream<Integer> fromList = list.stream();
        //Make parallel stream
        Stream<Integer> fromListParallel = list.parallelStream();

        Stream<String> names = Stream.of("Wajahat", "Adil");


    }
}
