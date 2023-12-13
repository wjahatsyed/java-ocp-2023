package chapter_04.review_questions;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * Created by Syed Wajahat on 12/22/2019.
 */
public class Question_7 {
    public static void main(String[] args) {
     /*   List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(3);

        integerList.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());

        IntStream is = IntStream.empty();
        is.sum();*/

      /*  LongStream ls = LongStream.of(1, 2, 3);
        OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
        if (opt.isPresent()) System.out.println(opt.getAsLong());*/

      /*  Stream.generate(() -> "1")
                .limit(10)
                .forEach(System.out::println);*/

       /* List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = Arrays.asList();
        Stream.of(l1, l2, l3).map(x -> x + 1)
                .flatMap(x -> x.stream()).forEach(System.out::print);*/

       /* Stream<Integer> s = Stream.of(1);
        IntStream is = s.mapToInt(x -> x);
        DoubleStream ds = s.mapToDouble(x -> x);
        Stream<Integer> s2 = ds.mapToInt(x -> x);
        s2.forEach(System.out::print);*/

        Stream<String> s = Stream.empty();
        Stream<String> s2 = Stream.empty();
        Map<Boolean, List<String>> p = s.collect(
                Collectors.partitioningBy(b -> b.startsWith("c")));
        Map<Boolean, List<String>> g = s2.collect(
                Collectors.groupingBy(b -> b.startsWith("c")));
        System.out.println(p + " " + g);

        Function<Integer, Integer> f = x -> x * x;

        DoubleStream si = DoubleStream.of(1.2, 2.4);
        si.peek(System.out::println).filter(x -> x > 2).count();

        List<Integer> l = IntStream.range(1, 6)
                .mapToObj(i -> i).collect(Collectors.toList());
        l.forEach(System.out::println);

        IntStream.range(1, 6)
                .forEach(System.out::println);

        Stream<String> seema = Stream.generate(() -> "meow");
        boolean b = seema.anyMatch(String::isEmpty);
        System.out.println(b);

    }
}
