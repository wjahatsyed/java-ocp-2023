package chapter_07.creating_Threads.creating_threads_with_ExecutorService.single_thread_executor;

import java.util.concurrent.*;

/**
 * Created by Syed Wajahat on 12/27/2019.
 */
public class Use_Submit {
    public static void main(String[] args)  {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit(() -> System.out.println("Wajahat"));
        //shows if the task is completed
        future.isDone();
        try{
            future.get();
            //keep it time bound
            future.get(1, TimeUnit.MINUTES  );
        }catch (InterruptedException | ExecutionException | TimeoutException e){

        }
        //get() - this can wait forever for the result

        //cancel execution
        //Cancel if isDone false
        future.cancel(future.isDone());
        //check is cancelled
        future.isCancelled();
        System.out.println(future);
    }
}
