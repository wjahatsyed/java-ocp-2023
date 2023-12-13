package chapter_04.using_streams.using_common_intermediate_operations;

import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class Use_Map {
    //Method map on Stream transforms the data
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Ahmer", "Zainab", "Zeeshan").parallel();
         stringStream.map(String::length).forEach(System.out::println);
        System.out.println(stringStream.isParallel());
    }

}
