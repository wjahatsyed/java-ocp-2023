package chapter_04.using_streams.working_with_primitives;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class MyClass {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        System.out.println(integerStream.reduce(0, (s, n) -> s + n));

        //use primitive
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3);
        System.out.println(integerStream1.mapToInt(x -> x).sum());

        //Get Average
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble optionalDouble = intStream.average();
        System.out.println(optionalDouble.getAsDouble());
    }
}
