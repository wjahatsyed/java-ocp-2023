package chapter_04.using_streams.using_terminal_operations;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class Use_Collect_Mutable_Reduction {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("w", "o", "l", "f");
        StringBuilder concatedString = stringStream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(concatedString);


        //Use TreeSet
        Stream<String> stringStream1 = Stream.of("w", "o", "l", "f");
        TreeSet<String> stringTreeSet = stringStream1.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(stringTreeSet);

        //Use toCollection
        Stream<String> stringStream2 = Stream.of("w", "o", "l", "f");
        TreeSet<String> stringTreeSet1 = stringStream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(stringTreeSet1);

        //Use toSet
        Stream<String> stringStream3 = Stream.of("w", "o", "l", "f");
        Set<String> stringSet = stringStream3.collect(Collectors.toSet());
        System.out.println(stringSet);

    }
}
