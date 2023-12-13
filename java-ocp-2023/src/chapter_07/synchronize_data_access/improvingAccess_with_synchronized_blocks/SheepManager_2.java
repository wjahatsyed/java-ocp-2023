package chapter_07.synchronize_data_access.improvingAccess_with_synchronized_blocks;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Syed Wajahat on 12/30/2019.
 */
public class SheepManager_2 {
    private int count = 0;
    private final Object lock = new Object();

    public void incrementAndReport() {
        synchronized (lock) {
            System.out.print((++count) + " ");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(20);
            executorService.submit(
                    () -> {
                        SheepManager_2 sheepManager_2 = new SheepManager_2();
                        for (int i = 0; i < 10; i++) {
                            sheepManager_2.incrementAndReport();
                        }
                    } );

        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }

    }
}
