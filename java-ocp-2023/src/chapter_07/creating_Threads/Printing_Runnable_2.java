package chapter_07.creating_Threads;
/**
 * Created by Syed Wajahat on 12/27/2019.
 * Example of implementing Runnable interface - Runnable is a functional interface
 */
public class Printing_Runnable_2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Running");
    }
    public static void main(String[] args){
        //When we call the start method on a thread, a thread is actually created.
        //There are two threads created in this code.
        /*
        One started by the mai method and the other started by .start() method of the thread
         */
        new Thread(new Printing_Runnable_2()).start();
    }
}
