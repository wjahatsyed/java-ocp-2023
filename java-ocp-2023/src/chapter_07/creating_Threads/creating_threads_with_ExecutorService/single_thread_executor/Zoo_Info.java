package chapter_07.creating_Threads.creating_threads_with_ExecutorService.single_thread_executor;

import java.util.concurrent.ExecutorService;

/**
 * Created by Syed Wajahat on 12/27/2019.
 * ExecutorService extends the Executor interface.
 * Executors has the factory method to provide instance of Executor through static nested class
 * We use static method newSingleThreadExecutor - It is a single thread executor which takes multiple
 * tasks to execute thru the execute() method.  The execute method is void so we do not know the result
 * The result is not directly accessible to the calling thread. Known as fire-and-forget.
 * The tasks added to the Thread are executed in sequence of the way they are added.
 * The singleThreadExecutor executes tasks asynchronously.
 */
public class Zoo_Info {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            System.out.println("Starting");
            //At this point, when first execute is called, the thread is started by executor
            //Takes Lambda as an input - takes no input and returns void
            executorService.execute(() -> System.out.println("Printing Zoo Inventory"));
            executorService.execute(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Printing: " + i);
                }
            });
            executorService.execute(() -> System.out.println("Printing Zoo Inventory"));
            System.out.println("Ending");
        } finally {
            if (executorService != null) {
                //This will shutdown the service.
                //There is difference between shutdown and shutdownNow();
                /*
                    shutdown does not terminate immediately. It executes the already submitted tasks to
                    the thread and reject new tasks.
                    isTerminated = true later in some time
                 */
                executorService.shutdown();
                /*
                A RejectedExecutionException (RunTimeException) is thrown when we have shut down the
                service and any new task is being submitted to the thread for execution
                 */
            }
        }
    }

}
