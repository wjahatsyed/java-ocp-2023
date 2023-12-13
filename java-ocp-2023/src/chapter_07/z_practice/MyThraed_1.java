package chapter_07.z_practice;

/**
 * Created by Syed Wajahat on 1/3/2020.
 */
public class MyThraed_1 extends Thread {
    @Override
    public void run() {
        //overriding the run method
        System.out.println("Hello!. Call me thru start");
    }

    public static void main(String[] args) {
        MyThraed_1 myThraed_1 = new MyThraed_1();
        myThraed_1.start();
    }
}
