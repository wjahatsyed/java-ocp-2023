package chapter_07.using_concurrent_collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * Use ConcurrentHashMap
 */
public class ZooManager {
    private Map<String, Object> foodData = new ConcurrentHashMap<>();

    //no need to use synchronized keyword because we are using concurrentHashMap
    public void put(String key, Object value) {
        foodData.put(key, value);
    }

    public Object get(String key) {
        return foodData.get(key);
    }
}
