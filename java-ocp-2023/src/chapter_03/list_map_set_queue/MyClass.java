package com.wajahat.ocp.chapter_3.list_map_set_queue;

/**
 * Created by Syed Wajahat on 12/15/2019.
 */
public class MyClass {
    /*
    Collection:
    From Collection: List, Queue and Set interface

    Map: It is separate interface but part of collection
     */

    //add method - returns boolean
    //boolean remove(Object o) method - returns boolean - 2 overloaded methods boolean remove(int index)
    //boolean isEmpty() and int size()
    //void clear()
    //boolean contains(Object o)
    //Total 6 methods

    //List interface uses an index - ordered and allow duplicates

    //order of magnitude difference
    /*
    O(1) - constant time
    O(log n) - like binary search
    O(n)


    //LinkedList - implements both List and Queue
    //Vector same as ArrayList but Vector is thread safe
    //Stack implements List but also extends Vector - Use ArrayDeque instead

    //get() method in List
    //set() method in List

    //Set Interface
    //HashSet() - constant time for adding and checking - order for entry is forgotten
    //TreeSet - implements Set and NavigableSet - O(log n) - keeps the elements sorted
    //Methods in NavigableSet -
    /*
    lower, floor, ceiling, higher


    //Queue Interface
    Queue is assume to FIFO otherwise LIFO
    //Queue queue = new ArrayDeque();
    //ArrayDeque arrayDeque = new ArrayDeque();
    /

    //Map
    HashMap - order is not maintained of entering elements - constant time
    LinkedHashMap - order of entry is maintained
    TreeMap - O(log n)
    Hashtable - same as HashMap but thread safe

    Map methods:
    1. isEmpty() 2. size() 3. clear() 4. get(K k) 5. put(K,v) 6. remove(K)
    7. containsKey 8. containsValue 9. keySet() 10. values()

    //TreeSet, TreeMap, ArrayDeque and Hashtable do not allow null values

     */



}
