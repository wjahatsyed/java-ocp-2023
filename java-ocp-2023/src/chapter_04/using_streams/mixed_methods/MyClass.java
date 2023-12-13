package chapter_04.using_streams.mixed_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class MyClass {
    public static void main(String[] args) {
        //prints String which has length of 4
        List<String> stringList = Arrays.asList("Waja", "Rifa", "Smoothy", "Wali");
        stringList.stream().filter(x -> x.length() == 4).sorted().limit(2).forEach(System.out::println);

        //another example with infinite stream
        Stream.generate(() -> "Elsa")
                .filter(x -> x.length() == 4)
                .limit(2).sorted().forEach(System.out::println);


    }
}
