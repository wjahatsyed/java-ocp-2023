package chapter_07.z_practice;

/**
 * Created by Syed Wajahat on 1/3/2020.
 */
public class My_Runnable implements Runnable {
    @Override
    public void run(){
        System.out.println("Wajahat");
    }

    public static void main(String[] args){
        //The Thread constructor takes a Runnable targer parameter which we in our case, pass
        //the new My_Runnable which is in fact implementing the Runnable interface.
        //As we know, from Chapter 2 that reference of an object can be passed to a method
        //which takes the interface which is implemented by the object reference class
        new Thread(new My_Runnable()).start();



    }
}
