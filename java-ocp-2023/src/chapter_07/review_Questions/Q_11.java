package chapter_07.review_Questions;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Syed Wajahat on 1/1/2020.
 */
public class Q_11 {
    public static void main(String[] args){
        Object o1 = new Object();
        Object o2 = new Object();
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<?> f1 = service.submit(() -> {
            synchronized (o1) {
                synchronized (o2) { System.out.println("Tortoise"); } // t1
            }
        });
        Future<?> f2 = service.submit(() -> {
            synchronized (o2) {
                synchronized (o1) { System.out.println("Hare"); } // t2
            }
        });
        //f1.get();
        //f2.get();
    }
}
