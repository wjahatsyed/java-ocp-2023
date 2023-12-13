package chapter_07.review_Questions;


/**
 * Created by Syed Wajahat on 1/1/2020.
 */

import java.util.concurrent.*;
import java.util.stream.*;

public class StockRoomTracker {
    public static void await(CyclicBarrier cb) { // j1
        try {
            cb.await();
        } catch (InterruptedException |
                BrokenBarrierException e) {
        }
    }
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(10,
                () -> System.out.println("Stock Room Full!")); // j2
        IntStream.iterate(1, i -> 1).limit(9)
                .parallel().forEach(i -> await(cb)); // j3
    }
}
