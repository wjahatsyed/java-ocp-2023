package chapter_07.using_concurrent_collections.working_with_concurrent_classes.understanding_blocking_queues;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * offerFirst, offerLast, pollFirst and pollLast
 * LinkedBlockingDeque maintains a doublyLinkedList
 * code: frontFromLeft, AntiClockwise Stack
 */
public class Use_LinkedBlockingDeque {
    public static void main(String[] args) throws InterruptedException {
        //BlockingDeque interface extends BlockingQueue and Deque
        //BlockingQueue extends Queue interface
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
        //LinkedBlockingDeque is double ended queue
        //Use 4 methods
        blockingDeque.offer(91);
        //add from front - like push
        blockingDeque.offerFirst(25, 1, TimeUnit.SECONDS);
        System.out.println(blockingDeque);
        //[25, 91]
        //add from back - like offer
        blockingDeque.offerLast(10, 1, TimeUnit.SECONDS);
        System.out.println(blockingDeque);
        //print [25, 91, 10];

        //poll first -
        blockingDeque.pollFirst(1, TimeUnit.SECONDS);
        System.out.println(blockingDeque);

        //poll last -
        blockingDeque.pollLast(1, TimeUnit.SECONDS);
        System.out.println(blockingDeque);

        blockingDeque.offerFirst(15);
        System.out.println(blockingDeque);

        System.out.println(blockingDeque.poll());


    }
}
