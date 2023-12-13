package chapter_07.synchronize_data_access.improvingAccess_with_synchronized_blocks.synchronizing_methods;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * Any instance method can have the keyword synchronized with the method signature
 * establish monitor/lock using synchronized keyword
 * **
 * An static method can also be marked as synchronized
 */
public class SheepManager {
    private int count = 0;
    private Object lock = new Object();

    /*private void incrementAndReport() {
        synchronized (this) {
            System.out.println((++count) + " ");
        }
    }*/

   /* private void incrementAndReport() {
        synchronized (lock) {
            System.out.println((++count) + " ");
        }
    }*/

    //Following is same as above
    synchronized private void incrementAndReport() {
        System.out.println((++count) + " ");
    }

    //static methods and synchronized keyword
    /*private static void printDaysWork(){
        //Class object is used as monitor/lock
        synchronized (SheepManager.class){
            System.out.println("Finished work");
        }
    }*/

    synchronized public static void printDaysWork() {
        System.out.println("Finished work");
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
