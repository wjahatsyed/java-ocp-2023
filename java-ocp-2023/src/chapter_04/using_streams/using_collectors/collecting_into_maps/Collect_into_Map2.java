package chapter_04.using_streams.using_collectors.collecting_into_maps;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/21/2019.
 */
public class Collect_into_Map2 {
    public static void main(String[] args) {
        //Partitioning - Special kind of grouping
        Stream<String> stringStream = Stream.of("Wajahat", "Zeeshan", "Ahmer", "Akram");
        Map<Boolean, List<String>> map = stringStream.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map);

        //counting
        Stream<String> stringStream1 = Stream.of("Akram", "Adil", "Asim", "Aslam");
        Map<Integer, Long> map1 = stringStream1.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map1);

        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));



    }
}
