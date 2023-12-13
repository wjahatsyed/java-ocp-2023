package chapter_07.runnable_objects;

/**
 * Created by Syed Wajahat on 12/26/2019.
 * Example of of creating Thread task
 */
public class CalculateAverage implements Runnable{
    @Override
    public void run() {
        System.out.println("Overriding run method");
    }

    public static void main(String[] args){
        CalculateAverage calculateAverage = new CalculateAverage();
        calculateAverage.run();
    }
}
