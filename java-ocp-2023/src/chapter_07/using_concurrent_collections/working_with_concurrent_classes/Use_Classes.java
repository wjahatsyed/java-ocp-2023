package chapter_07.using_concurrent_collections.working_with_concurrent_classes;

import java.util.Deque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * If we talk about non concurrent collections, following are the ones which are not null
 * Queue, Hashtable (thread safe HashMap). TreeSet and TreeMap
 * This class gives you examples of: ConcurrentHashMap, ConcurrentLinkedDeque and ConcurrentLinkedQueue
 */
public class Use_Classes {
    public static void main(String[] args) {
        //access ConcurrentHashMap with Map or ConcurrentMap interfaces' reference.
        Map<String, Integer> stringIntegerMap = new ConcurrentHashMap<>();
        stringIntegerMap.put("Wajahat", 1);
        stringIntegerMap.put("Zeeshan", 2);

        ConcurrentMap<String, Integer> letUserKnow = (ConcurrentMap<String, Integer>) stringIntegerMap;
        System.out.println(letUserKnow);
        //or
        ConcurrentMap<String, Integer> letUserKnow1 = new ConcurrentHashMap<>(stringIntegerMap);
        System.out.println(letUserKnow1);

        //Queue - use it as a normal queue - FIFO
        Queue<String> concurrentQueue = new ConcurrentLinkedQueue<>();
        //add items to the queue
        concurrentQueue.offer("Wajahat");
        concurrentQueue.offer("Zeeshan");
        concurrentQueue.offer("Waqar");

        //peek just returns the last element - prints Wajahat
        System.out.println(concurrentQueue.peek());
        //poll delete and returns the last element
        System.out.println(concurrentQueue.poll());


        //Deque - LIFO - LIke ArrayDeque
        Deque<String> stringDeque = new ConcurrentLinkedDeque<>();
        stringDeque.push("Wajahat");
        stringDeque.push("Zeeshan");
        stringDeque.push("Waqar");

        //peek top element
        System.out.println(stringDeque.peek());
        //remove top element - Waqar
        System.out.println(stringDeque.pop());
        System.out.println(stringDeque);


    }


}
