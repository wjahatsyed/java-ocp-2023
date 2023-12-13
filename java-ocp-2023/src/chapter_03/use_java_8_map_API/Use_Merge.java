package chapter_03.use_java_8_map_API;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class Use_Merge {
    public static void main(String[] args) {
        //If v1 is longer than v2, then v1 else v2
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");
        System.out.println(favorites);

        favorites.merge("Jenny", "Sky Riding", mapper);

        System.out.println(favorites);

        //compute_If_Present works with BiFunction
        //compute_If_Absent works with Function

    }
}
