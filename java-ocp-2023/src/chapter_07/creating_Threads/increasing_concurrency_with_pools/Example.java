package chapter_07.creating_Threads.increasing_concurrency_with_pools;

import java.util.concurrent.*;

/**
 * Created by Syed Wajahat on 12/29/2019.
 * Three factory methods of Executors factory class
 * 1. newCachedThreadPool() - returns ExecutorService
 * 2. newFixedThreadPool(int nThreads) - returns ExecutorService
 * 3. newScheduledThreadPool(int nThreads) - returns ScheduledExecutorService
 * Multi-threading is used to achieve concurrency - execute tasks simaltaneously
 */
public class Example {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService scheduledExecutorService = null;
        try {
            scheduledExecutorService = Executors.newScheduledThreadPool(10);
            Runnable runnable = () -> System.out.println("Wajahat");
            /*
            As we know, scheduleAtFixedRate will keep entering the tasks to the threads without
            considering the fact whether the previously submitted/scheduled task to the thread is completed or not.
            In this case, ScheduledThreadPool will ensure that not more than 10 threads are created and even if the
            tasks are submitted for completion, they are queued and when threads are freed, they will assigned to
            these queued tasks.
             */
            ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(
                    runnable, 3, 1, TimeUnit.SECONDS);
            System.out.println(scheduledFuture.get());

        } finally {
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
        }

    }
}
