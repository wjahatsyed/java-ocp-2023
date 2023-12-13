package chapter_07.review_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

/**
 * Created by Syed Wajahat on 1/1/2020.
 */
public class MyClass {
    public static void main(String[] args) {
        AtomicLong value1 = new AtomicLong(0);
        final long[] value2 = {0};
        IntStream.iterate(1, i -> 1).limit(100).parallel()
                .forEach(i -> value1.incrementAndGet());
        IntStream.iterate(1, i -> 1).limit(100).parallel()
                .forEach(i -> ++value2[0]);
        System.out.println(value1 + " " + value2[0]);

        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = new CopyOnWriteArrayList<>(l1);
        Set<Integer> s3 = new ConcurrentSkipListSet<>();
        s3.addAll(l1);
        l2.forEach(l -> l2.add(l));
        s3.forEach(l -> s3.add(4));
        System.out.println(l1.size() + " " + l2.size() + " " + s3.size());

        Integer i1 = Arrays.asList(1, 2, 3, 4, 5).stream().findAny().get();
        synchronized (i1) { // y1
            Integer i2 = Arrays.asList(6, 7, 8, 9, 10)
                    .parallelStream()
                    .sorted() // y2
                    .findAny().get(); // y3
            System.out.println(i1 + " " + i2);
        }
    }
}
