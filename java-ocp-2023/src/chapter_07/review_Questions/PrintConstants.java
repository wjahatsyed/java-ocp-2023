package chapter_07.review_Questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.DoubleStream;

/**
 * Created by Syed Wajahat on 1/1/2020.
 */
public class PrintConstants {
    public static void main(String[] args) {
        ExecutorService service = Executors.newScheduledThreadPool(10);
        DoubleStream.of(3.14159,2.71828) // b1
                .forEach(c -> service.submit( // b2
                        () -> System.out.println(10*c))); // b3
        service.execute(() -> System.out.println("Printed")); // b4
    }
}
