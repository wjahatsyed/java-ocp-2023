package chapter_07.review_Questions;


/**
 * Created by Syed Wajahat on 1/1/2020.
 */
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
public class PrintCounter {
    static int counter = 0;
    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        List<Future<?>> results = new ArrayList<>();
        IntStream.iterate(0,i -> i+1).limit(5).forEach(
                i -> results.add(service.submit(() -> counter++)) // n1
        );
        for(Future<?> result : results) {
            System.out.print(result.get()+" "); // n2
        }
        service.shutdown();
    }
}
