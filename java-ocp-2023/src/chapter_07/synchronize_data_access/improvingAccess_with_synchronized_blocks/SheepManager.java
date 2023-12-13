package chapter_07.synchronize_data_access.improvingAccess_with_synchronized_blocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * The same SheepManager example - this time with a synchronized block
 */
public class SheepManager {
    private int count = 0;

    private void incrementAndReport() {
        synchronized (this) {
            System.out.println((++count) + " ");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(20);
            executorService.submit(() -> {
                SheepManager sheepManager = new SheepManager();
                for (int i = 0; i < 10; i++) {
                    sheepManager.incrementAndReport();
                }
            });
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }


    }
}
