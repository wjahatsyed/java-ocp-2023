package chapter_07.creating_Threads;

/**
 * Created by Syed Wajahat on 12/27/2019.
 */
public class Inventory_Thread_2 extends Thread {
    @Override
    public void run(){
        System.out.println("Running Makko");
    }
    public static void main(String[] args){
        /*
        We can call the start method on the newly created object of Inventory_Thread_2 because
        the parent of the class is Thread so a child can call method of the parent.
         */
        new Inventory_Thread_2().start();
    }
}
