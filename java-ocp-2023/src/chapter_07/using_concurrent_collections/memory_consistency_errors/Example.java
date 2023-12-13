package chapter_07.using_concurrent_collections.memory_consistency_errors;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * ConcurrentHashMap ensure when it reads, the value is not written and while writing, no other is reading and update on time
 */
public class Example {
    public static void main(String[] args) {
        //non Concurrent collection
        Map<String, Integer> myNonConcurrentMap = new HashMap<>();
        myNonConcurrentMap.put("Wajahat", 1);
        myNonConcurrentMap.put("Ahmer", 2);
        /*for (String key : myNonConcurrentMap.keySet()) {
            //This will throw ConcurrentModificationException
            myNonConcurrentMap.remove(key);
        }*/

        //above example with ConcurrentHashMap
        Map<String, Integer> myConcurentMap = new ConcurrentHashMap<>();
        myConcurentMap.put("Wajahat", 1);
        myConcurentMap.put("Ahmer", 2);
        for(String key: myConcurentMap.keySet()){
            //once this removes a key, it will update the keyset right away
            myConcurentMap.remove(key);
        }
        //print empty map because all pairs are removed
        System.out.println(myConcurentMap);
    }
}
