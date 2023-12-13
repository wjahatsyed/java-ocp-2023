package chapter_07.creating_Threads;

/**
 * Created by Syed Wajahat on 12/26/2019.
 */
public class Printing_Runnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Printing: " + i);
        }
    }

    public static void main(String[] args){
        //We insert the runnable object in the Thread constructor
        //The start method creates a new thread
        //If the start method is not not called, the thread opened by main method will be used.
        //No new thread will be created if .start() is not called
        new Thread(new Printing_Runnable()).start();
    }
}
