package chapter_07.creating_Threads.creating_threads_with_ExecutorService.single_thread_executor;

import java.util.concurrent.*;

/**
 * Created by Syed Wajahat on 12/27/2019.
 */
public class CheckResults_2 {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();
            Future<?> result = executorService.submit(() -> {
                for (int i = 0; i < 500; i++) {
                    counter++;
                }
            });

            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached");

        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        } finally {
            //We have to use finally because the Executors class do no implement the AutoCloseable interface
            if (executorService != null) {
                executorService.shutdown();
            }

        }

    }
}
