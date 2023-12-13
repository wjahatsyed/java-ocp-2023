package chapter_04.using_streams.advance_stream_pipeline_concepts;

import java.util.Optional;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class ChainingOptionals {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(123);
        threeDigit(optional);
    }

    private static void threeDigit(Optional<Integer> optional) {
        optional.map(s -> "" + s).filter(s -> s.length() == 3).ifPresent(System.out::println);
    }
}
