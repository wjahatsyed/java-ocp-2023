package chapter_04.using_streams.using_common_intermediate_operations;

import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class Using_Filter {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("wajahat", "Zeeshan", "Zahid").parallel();

        stringStream.filter(s -> s.startsWith("Z")).forEach(System.out::println);
        System.out.println(stringStream.isParallel());
    }
}
