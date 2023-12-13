package chapter_07.identifying_threading_problems;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Syed Wajahat on 1/1/2020.
 * Typical example of deadlock
 */
public class Fox {
    public void eatAndDrink(Food food, Water water) {
        synchronized (food) {
            System.out.println("Got Food");
            move();
            synchronized (water) {
                System.out.println("Got Water");
            }
        }
    }

    public void DrinkAndEat(Water water, Food food) {
        synchronized (water){
            System.out.println("Got Water");
            move();
            synchronized (food) {
                System.out.println("Got Food");
            }
        }
    }

    public void move() {
        try {
            //10 milli seconds from one resource to the other
            Thread.sleep(10);
        } catch (InterruptedException e) {

        }
    }

    public static void main(String[] args) {
        Fox foxy = new Fox();
        Fox tails = new Fox();
        Food food = new Food();
        Water water = new Water();

        ExecutorService executorService = null;
        try{
            executorService = Executors.newFixedThreadPool(10);
            executorService.submit(() -> foxy.eatAndDrink(food, water));
            executorService.submit(()-> tails.DrinkAndEat(water, food));


        }finally {
            if(executorService !=null){
                executorService.shutdown();
            }
        }

    }
}

class Water {
}

class Food {
}
