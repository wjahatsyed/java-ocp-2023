package chapter_04.using_streams.using_common_intermediate_operations;

import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class Use_peek {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Wajahat", "GWajahat", "GZeeshan");
        long count = stringStream.filter(s -> s.startsWith("G")).peek(System.out::println).count();
        System.out.println(count);
    }
}
