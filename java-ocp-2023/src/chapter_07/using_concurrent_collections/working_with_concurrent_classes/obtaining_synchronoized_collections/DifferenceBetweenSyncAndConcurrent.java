package chapter_07.using_concurrent_collections.working_with_concurrent_classes.obtaining_synchronoized_collections;

import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Syed Wajahat on 12/30/2019.
 */
public class DifferenceBetweenSyncAndConcurrent {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
        map.put(1, "Wajahat");
        map.put(2, "Zeeshan");
        try{
        for (int i : map.keySet()) {

                System.out.println(i);
                //Below line will throw exception ConcurrentModificationException
                map.remove(i);
            }

        }catch (ConcurrentModificationException c){
            System.out.println(c);
        }

        //Following concurrent will not throw exception
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "Wajahat");
        concurrentMap.put(2, "Zeeshan");
        for(int i:  concurrentMap.keySet()){
            System.out.println(i);
            concurrentMap.remove(i);
        }
    }
}
