package chapter_07.creating_Threads.creating_threads_with_ExecutorService.introducing_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Syed Wajahat on 12/27/2019.
 */
public class AddData {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();
            Future<Integer> result = executorService.submit(() -> 20 + 6);
            //get 26
            /*
            This is the difference between calling get on runnable lambda expression and callable lambda
            Here because of callable it will either return null or the future object of generic type
             */
            System.out.print(result.get());
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }

        }
    }
}
