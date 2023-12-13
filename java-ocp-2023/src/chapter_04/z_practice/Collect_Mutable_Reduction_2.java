package chapter_04.z_practice;

import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 1/2/2020.
 */
public class Collect_Mutable_Reduction_2 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("w", "o", "l", "f");
        TreeSet<String> stringTreeSet =
                stringStream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);

        System.out.println(stringTreeSet);
    }
}
