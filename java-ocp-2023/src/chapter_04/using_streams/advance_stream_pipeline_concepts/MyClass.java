package chapter_04.using_streams.advance_stream_pipeline_concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class MyClass {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Billoi");
        cats.add("Mewao");
        Stream<String> stringStream = cats.stream();
        cats.add("ABC");
        //Count is a reduction finite function
        System.out.println(stringStream.count());
        //The above will print 3 because Streams are lazily evaluated
    }
}
