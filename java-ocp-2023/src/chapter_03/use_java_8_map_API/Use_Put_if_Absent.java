package chapter_03.use_java_8_map_API;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class Use_Put_if_Absent {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("Wajahat", "Adil");
        map.put("Ahmer", null);

        System.out.println(map);

        map.putIfAbsent("Ahmer", "Adil");
        map.putIfAbsent("Zeeshan", "Adil");

        System.out.println(map);
    }
}
