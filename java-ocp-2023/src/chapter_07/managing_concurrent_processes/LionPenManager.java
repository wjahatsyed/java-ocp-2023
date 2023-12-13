package chapter_07.managing_concurrent_processes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Syed Wajahat on 12/31/2019.
 * An example without using the CyclicBarrier
 * LionPenManager instance is considered as a Zoo Worker here which will first
 * remove the animals, clean the cage then again put the animal back to the cage.
 * Each thread (Zoo Worker) will perform these three tasks
 * The result will multiple threads will not be ordered unlike a single thread executor
 */
public class LionPenManager {
    public void performTasks() {
        removeAnimals();
        cleanCage();
        addAnimals();
    }

    public void removeAnimals() {
        System.out.println("Animal removed");
    }

    public void cleanCage() {
        System.out.println("Cage cleaned");
    }

    public void addAnimals() {
        System.out.println("Animals added");
    }

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            //4 zoo workers (threads)
            executorService = Executors.newFixedThreadPool(4);
            LionPenManager lionPenManager = new LionPenManager();
            for (int i = 0; i < 4; i++) {
                executorService.submit(() -> lionPenManager.performTasks());
            }
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }

    }
}

