package chapter_07.synchronize_data_access;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Syed Wajahat on 12/29/2019.
 * An example using newFixedThreadPoolExecutor and submit
 * Remember: submit has two overloaded methods - for runnable and callable
 * ++ is not Thread safe. It can cause race condition
 * ++ is an operation which carries out tasks which are not atomic.
 * i.e. read and write which can be interrupted by other threads
 */
public class SheepManager {
    private int count = 0;

    public void incrementAndReport() {
        /*
        ++count
        is like:
        count = count +1;
        What if two threads read the right side of the expression without writing
        Thread synchronization issue
         */
        System.out.print((++count) + " ");
    }

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(20);
            executorService.submit(() -> {
                SheepManager sheepManager = new SheepManager();
                for (int i = 0; i < 10; i++) {
                    sheepManager.incrementAndReport();
                }
            });
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }

}
