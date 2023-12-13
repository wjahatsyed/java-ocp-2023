package chapter_07.creating_Threads.creating_threads_with_ExecutorService.introducing_callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Syed Wajahat on 12/27/2019.
 * Use Thread.sleep with submit
 * Callable supports InterruptedException
 */
public class Ver_Imp_1 {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();
            executorService.submit(() -> {
                Thread.sleep(10);
                return null;
            });

            //Following will not compile
            //Unhandled Interrupted Exception because Runnable is called
            //executorService.submit(() -> {Thread.sleep(5);});
            executorService.submit(() -> {
                Thread.sleep(15);
                return null;
            });

        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
