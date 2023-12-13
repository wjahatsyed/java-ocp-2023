package chapter_04.review_questions;

import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/22/2019.
 */
public class Qustion_3 {
    public static void main(String[] args) {
       /* Predicate<? super String> predicate = s -> s.length() > 3;
        Stream<String> stream = Stream.iterate("-", (s) -> s + s);
        boolean b1 = stream.noneMatch(predicate);
        boolean b2 = stream.anyMatch(predicate);
        System.out.println(b1 + " " + b2);
*/
        Stream<String> s = Stream.generate(() -> "meow");
        boolean match = s.noneMatch(String::isEmpty);
        System.out.println(match);

    }
}
