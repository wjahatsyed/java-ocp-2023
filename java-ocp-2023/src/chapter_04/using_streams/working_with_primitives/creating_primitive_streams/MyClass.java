package chapter_04.using_streams.working_with_primitives.creating_primitive_streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class MyClass {
    //Three types of primitive streams
    /*
    IntStream: int, char, short, byte
    LongStream: for long
    DoubleStream: for double and float

    empty(), of(), forEach(), generate() and iterate() same as Stream
     */

    public static void main(String[] args) {
        DoubleStream random = DoubleStream.generate(Math::random);
        random.limit(3).forEach(System.out::println);

        //use fraction
        DoubleStream fraction = DoubleStream.iterate(.5, d -> d / 2);
        fraction.limit(3).forEach(System.out::println);

        //Use range and rangeClosed
        IntStream intStream = IntStream.range(1, 6);
        intStream.forEach(System.out::println);

        IntStream intStream1 = IntStream.rangeClosed(1, 5);
        intStream1.forEach(System.out::println);

        //Convert from Stream to other and vice versa
        Stream<String> stringStream = Stream.of("Wajahat", "Syed");
        IntStream intStream2 = stringStream.mapToInt(s -> s.length());
        intStream2.forEach(System.out::println);










    }
}
