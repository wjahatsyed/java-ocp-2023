package chapter_07.using_concurrent_collections.working_with_concurrent_classes.understanding_SkipList_Collections;

import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * when use see SkipListMap or SkipListSet it means sorted concurrent TreeMap and TreeSet
 * Use SortedMap and NavigableSet interface references
 */
public class MyClass {
    public static void main(String[] args) {
        SortedMap<Integer, String> concurrentMap = new ConcurrentSkipListMap<>();
        concurrentMap.put(1, "Wajahat");
        NavigableSet<Integer> set = new ConcurrentSkipListSet<>();
        set.add(1);
        set.add(12);

        NavigableSet<String> navigableSet = new ConcurrentSkipListSet<>();
        SortedSet<String> sortedSet = new ConcurrentSkipListSet<>();
    }
}
