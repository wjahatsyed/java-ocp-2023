package chapter_07.using_concurrent_collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * use synchronized block to access Collections
 * We can forget to synchronize some methods or synchronize unnecessarily and degrade performance
 */
public class Old_Example {
    private Map<String, Object> map = new HashMap<>();

    //setter/put with synchronized
    public synchronized void put(String key, Object value) {
        map.put(key, value);
    }

    //getter
    public synchronized Object get(String key){
        return map.get(key);
    }

}
