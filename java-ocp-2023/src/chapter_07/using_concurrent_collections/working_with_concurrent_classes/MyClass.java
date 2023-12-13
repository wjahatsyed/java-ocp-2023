package chapter_07.using_concurrent_collections.working_with_concurrent_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * If the collection is immutable or read only the Concurrent Collection is not required
 */
public class MyClass {
    public static void main(String[] args) {
        //good practice - access ArrayList object with List reference
        List<Integer> list = new ArrayList<>();
        //similarly use non concurrent reference to access concurrent collections objects
        Map<String, Integer> map = new ConcurrentHashMap<>();

    }
}
