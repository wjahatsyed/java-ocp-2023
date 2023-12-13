package chapter_07.creating_Threads.creating_threads_with_ExecutorService.shceduled_executor_service;

import java.util.concurrent.*;

/**
 * Created by Syed Wajahat on 12/29/2019.
 * Scheduled at fixed rate submits/starts new tasks without caring old task has completed or not
 */
public class Scheduled_At_FixedRate {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduledExecutorService = null;
        try {
            scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
            Runnable runnable = () -> System.out.println("Hello");
            ScheduledFuture<?> result =
                    scheduledExecutorService.scheduleAtFixedRate(runnable, 5, 1, TimeUnit.SECONDS);
            System.out.println(result.get());
        } finally {
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
        }
    }
}
