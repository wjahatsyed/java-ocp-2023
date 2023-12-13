package chapter_04.z_practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 1/3/2020.
 */
public class Common_Collectors_3 {
    public static void main(String[] args) {
       /* Stream<String> stringStream = Stream.of("Adil", "Asim", "Akram", "Aslam");
        Map<Integer, String> myMap =
                stringStream.collect(Collectors.toMap(
                        String::length, v -> v, (s1, s2) -> s1 + "," + s2
                ));
        System.out.println(myMap);*/
        Stream<String> stringStream = Stream.of("Adil", "Asim", "Akram", "Aslam");
        Map<Integer, List<String>> integerListMap =
                stringStream.collect(Collectors.groupingBy(String::length));

        System.out.println(integerListMap);

    }
}
