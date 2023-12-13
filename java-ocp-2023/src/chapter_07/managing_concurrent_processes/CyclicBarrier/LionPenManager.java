package chapter_07.managing_concurrent_processes.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Syed Wajahat on 12/31/2019.
 * In the previous example of LionPenManager at the root level of
 * managing_concurrent_processes package, the output was not ordered.
 * This is not practically a good example if the output is not ordered.
 * <p>
 * <p>
 * In order to avoid deadlock, the number of threads must at least be the same as the number
 * of limit in the cyclic barrier. The number of threads can be more but if they are less than
 * the number of cyclic barrier limit, it will create deadlock as the limit will never be reached.
 * <p>
 * As we know, cyclic barrier is released when all the threads as per limit count have called the await method
 * <p>
 * There is a slight performance trade off here. The zoo worker 1 has to wait for zoo worker 2 for finish a task
 * and so on then a new task is started
 */
public class LionPenManager {
    public void removeAnimals() {
        System.out.println("Animal removed");
    }

    public void cleanCage() {
        System.out.println("Cage cleaned");
    }

    public void addAnimals() {
        System.out.println("Animals added");
    }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
        try {
            removeAnimals();
            //wait for all 4 threads to complete the task
            c1.await();
            cleanCage();
            //wait for all 4 threads to complete the task
            c2.await();
            //final task
            addAnimals();
        } catch (InterruptedException | BrokenBarrierException e) {

        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(4);

            LionPenManager lionPenManager = new LionPenManager();
            CyclicBarrier c1 = new CyclicBarrier(4);
            CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("** Done cleaning"));

            for (int i = 0; i < 4; i++) {
                executorService.submit(() ->
                        lionPenManager.performTask(c1, c2));
            }

        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }

}
