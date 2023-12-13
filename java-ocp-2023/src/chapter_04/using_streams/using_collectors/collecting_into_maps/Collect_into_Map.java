package chapter_04.using_streams.using_collectors.collecting_into_maps;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/21/2019.
 */
public class Collect_into_Map {
    public static void main(String[] args) {
        //normal collecting with string as key, length as value
        //Throws duplication key - IllegalStateException
        /*Stream<String> stringStream = Stream.of("Aslam", "Akram", "Adil", "Asim");
        Map<String, Integer> myMap1 =
                stringStream.collect(Collectors.toMap(s -> s, String::length));
        System.out.println(myMap1);*/

        //another
        Stream<String> stringStream2 = Stream.of("Aslam", "Akram", "Adil", "Asim");
        stringStream2.collect(Collectors.toMap(Function.identity(), String::length));


        //Example of pairing of same length strings comma separated
        Stream<String> stringStream3 = Stream.of("Aslam", "Akram", "Adil", "Asim");
        Map<Integer, String> map =
                stringStream3.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        System.out.println(map);

        //Use TreeSet
        Stream<String> stringStream4 = Stream.of("Aslam", "Akram", "Adil", "Asim");
        TreeMap<Integer, String> treeMap =
                stringStream4.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));

        //Use groupingBy
        Stream<String> stringStream5 = Stream.of("Aslam", "Akram", "Adil", "Asim");
        Map<Integer, List<String>> map1 = stringStream5.collect(Collectors.groupingBy(String::length));
        System.out.println(map1 +"Now");

        //Grouping by Collector - use Set as value in Map
        Stream<String> stringStream6 = Stream.of("Aslam", "Akram", "Adil", "Asim");
        Map<Integer, Set<String>> map2 = stringStream6.collect(
                Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map2);

        Stream<String> stringStream7 = Stream.of("Aslam", "Akram", "Adil", "Asim");
        TreeMap<Integer, Set<String>> map3 = stringStream7.collect(Collectors.groupingBy(
                String::length, TreeMap::new, Collectors.toSet()));

        System.out.println(map3);


    }
}
