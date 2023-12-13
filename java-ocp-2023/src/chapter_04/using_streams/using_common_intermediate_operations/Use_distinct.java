package chapter_04.using_streams.using_common_intermediate_operations;

import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class Use_distinct {
    public static void main(String[] args){
        Stream<String> stringStream = Stream.of("duck", "duck", "goose", "google");
        stringStream.parallel();
        stringStream.distinct().forEach(System.out::println);
        System.out.println(stringStream.isParallel());

    }
}
