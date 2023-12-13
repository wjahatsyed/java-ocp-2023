package chapter_07.creating_Threads;

/**
 * Created by Syed Wajahat on 12/26/2019.
 * Either implement Runnable or extend Thread or use Executor Service
 */
public class Inventory_Thread extends Thread {
    @Override
    public void run() {
        System.out.println("Printing Inventory");
    }

    public static void main(String[] args) {
       new Inventory_Thread().start();
    }
}
