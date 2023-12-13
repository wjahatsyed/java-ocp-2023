package chapter_04.built_in_functional_interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by Syed Wajahat on 12/17/2019.
 */
public class Implementing_Consumer_BiConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Wajahat");

        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept("Syed Muhammad Wajahat");

        Map<String, Integer> stringIntegerMap = new HashMap<>();

        BiConsumer<String, Integer> biConsumer1 = (K, V) -> stringIntegerMap.put(K, V);
        //or
        biConsumer1 = stringIntegerMap::put;

        biConsumer1.accept("Wajahat", 25);
        biConsumer1.accept("Zeeshan", 20);

        System.out.println(stringIntegerMap);

    }
}
