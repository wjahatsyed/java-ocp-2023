package chapter_07.synchronize_data_access.protecting_data_with_atomic_classes;

import java.util.concurrent.atomic.*;

/**
 * Created by Syed Wajahat on 12/29/2019.
 * Some methods of Atomic classes
 */
public class Other_Class {
    public static void main(String[] args){
        AtomicInteger atomicInteger = new AtomicInteger(0);
        //set value of int
        atomicInteger.set(1);
        //get value
        atomicInteger.get();
        //getAndSetAtTheSameTime
        System.out.println(atomicInteger.getAndSet(5));
        //pre increment
        atomicInteger.incrementAndGet();
        //post increment
        atomicInteger.getAndIncrement();
        //pre decrement
        atomicInteger.decrementAndGet();
        //post decrement
        atomicInteger.getAndDecrement();
    }

}
