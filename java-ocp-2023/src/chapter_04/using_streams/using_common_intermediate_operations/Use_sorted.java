package chapter_04.using_streams.using_common_intermediate_operations;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 * 2 overloadings
 */
public class Use_sorted {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Wajahat", "Ahmer", "Zeeshan").parallel();
        stringStream.sorted().forEach(s-> System.out.print(s + " "));
        System.out.println(stringStream.isParallel());

        System.out.println();

        //Use comparator overloaded method
        Stream<String> stringStream1 = Stream.of("Wajahat", "Ahmer", "Zeeshan").parallel();
        stringStream1.sorted(Comparator.reverseOrder()).forEach(s-> System.out.print(s + " "));
        System.out.println(stringStream1.isParallel());
    }
}
