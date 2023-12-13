package chapter_07.using_concurrent_collections.working_with_concurrent_classes.obtaining_synchronoized_collections;

import java.util.*;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * All these methods are in Collections
 */
public class MyClass {
    public static void main(String[] args) {
        //synchronized collection
        Collection<Integer> collection = new ArrayList<>();
        Collections.synchronizedCollection(collection);

        //synchronized List
        List<Integer> list = new ArrayList<>();
        Collections.synchronizedList(list);

        //synchronizedMap
        Map<Integer, String> map = new HashMap<>();
        Collections.synchronizedMap(map);

        //synchronizedSet
        Set<Integer> set = new HashSet<>();
        Collections.synchronizedSet(set);

        //NavigableMap
        NavigableMap<Integer, Integer> integerIntegerMap = new TreeMap<>();
        Collections.synchronizedNavigableMap(integerIntegerMap);

        //NavigableSet
        NavigableSet<Integer> integerNavigableSet = new TreeSet<>();
        Collections.synchronizedSet(integerNavigableSet);

        //SortedMap
        SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
        Collections.synchronizedSortedMap(sortedMap);

        //SortedSet
        SortedSet<Integer> sortedSet = new TreeSet<>();
        Collections.synchronizedSet(sortedSet);

    }
}
