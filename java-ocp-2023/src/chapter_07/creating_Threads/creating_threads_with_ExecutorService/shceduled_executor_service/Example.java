package chapter_07.creating_Threads.creating_threads_with_ExecutorService.shceduled_executor_service;

import java.util.concurrent.*;

/**
 * Created by Syed Wajahat on 12/28/2019.
 * ScheduledExecutorService is a sub interface of Executor
 */
public class Example {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        //The scheduledExecutorService has the getDelay() method in the ScheduledFuture interface because it extends
        //the Delay interface

        Runnable runnable = () -> System.out.println("Runnable task");
        Callable callable = () -> "Wajahat";
        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.schedule(runnable, 1, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduledFuture1 = scheduledExecutorService.schedule(callable, 5, TimeUnit.SECONDS);
        System.out.println(scheduledFuture1.get());

    }
}
