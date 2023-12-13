package chapter_07.creating_Threads.creating_threads_with_ExecutorService.shceduled_executor_service;

import java.util.concurrent.*;

/**
 * Created by Syed Wajahat on 12/29/2019.
 */
public class Schedule_At_Fixed_Delay {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduledExecutorService = null;
        try {
            Runnable runnable = () -> System.out.println("Doctor visit in the Zoo");
            scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
            ScheduledFuture<?> result = scheduledExecutorService.scheduleWithFixedDelay(runnable
                    , 0, 1, TimeUnit.DAYS);

            System.out.println(result.get());

        } finally {
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
        }
    }
}
