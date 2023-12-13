package chapter_04.using_streams.using_common_intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class Use_Flat_Map {
    public static void main(String[] args) {
        List<String> one = Arrays.asList();
        List<String> two = Arrays.asList("Zainab");
        List<String> three = Arrays.asList("Wajahat", "Zeeshan");

        Stream<List<String>> listStream = Stream.of(one, two, three).parallel();
        listStream.flatMap(l -> l.stream()).forEach(System.out::println);
        System.out.println(listStream.isParallel());

    }
}
