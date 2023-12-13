package chapter_07.z_practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Syed Wajahat on 1/3/2020.
 */
public class MyClass_1 {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();
            executorService.execute(() -> System.out.println("fuck them all"));
        } finally {
            if (executorService != null) {
                executorService.shutdown();

            }
        }
    }
}
