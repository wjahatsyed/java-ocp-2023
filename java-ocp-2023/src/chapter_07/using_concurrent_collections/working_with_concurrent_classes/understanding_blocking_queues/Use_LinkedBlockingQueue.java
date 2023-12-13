package chapter_07.using_concurrent_collections.working_with_concurrent_classes.understanding_blocking_queues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * BlockingQueue reference and LinkedBlockingQueue object
 * LinkedBlockingQueue maintains a LinkedList between elements
 * They are methods which waits for operation and they throw InterruptedException
 */
public class Use_LinkedBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();
        blockingQueue.offer("Wajahat");
        try {
            //returns false if the time elapses and string object is not added in to the LinkedBlockingQueue
            boolean b = blockingQueue.offer("Zeeshan", 4, TimeUnit.SECONDS);
            //wait for 10 seconds and removes the last element from queue - remove Wajahat after 10 seconds
            blockingQueue.poll(4, TimeUnit.SECONDS);
            System.out.println(blockingQueue);

        } catch (InterruptedException e) {
            System.out.print(e.getMessage());
        }
    }
}
