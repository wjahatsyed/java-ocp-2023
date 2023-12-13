package chapter_04.using_streams.using_collectors;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/21/2019.
 */
public class Using_Common_Collectors {
    public static void main(String[] args) {
        //Collectors is a helper class which works with Collector
        Stream<String> stringStream = Stream.of("Wajahat", "Zeeshan", "Ahmer");
        String string = stringStream.collect(Collectors.joining(","));
        System.out.println(string);

        Stream<String> stringStream1 = Stream.of("Tigers", "Lions", "Beers");
        Double average = stringStream1.collect(Collectors.averagingInt(String::length));
        System.out.println(average);

        Stream<String> stringStream2 = Stream.of("Wajahat", "Ahmer", "Wania");
        TreeSet<String> treeSet = stringStream2
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);






    }
}
