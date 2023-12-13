package chapter_07.synchronize_data_access.protecting_data_with_atomic_classes;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.*;

/**
 * Created by Syed Wajahat on 12/29/2019.
 * Thera are different operations available - check other class
 */
public class SheepManager_AtomicInteger {
    private AtomicInteger atomicIntegerCount = new AtomicInteger(0);

    public void incrementAndReport() {
        //incrementAndGet is atomic alternate of ++count
        System.out.print(atomicIntegerCount.incrementAndGet() + " ");
    }

    public static void main(String[] args) {
        ExecutorService executorService = null;
        SheepManager_AtomicInteger sheepManager_atomicInteger = new SheepManager_AtomicInteger();
        try {
            executorService = Executors.newFixedThreadPool(20);
            executorService.submit(() -> {
                for (int i = 0; i < 10; i++) {
                    sheepManager_atomicInteger.incrementAndReport();
                }
            });
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
