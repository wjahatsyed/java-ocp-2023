package chapter_04.using_streams.using_terminal_operations;

import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/18/2019.
 */
public class MyClass {
    /*
    Reduction is a special kind of terminal operation
    which combines the result of the stream and return it
    as primitive or an object.

     */

    //Following are the methods on Steam Terminal Operations

    public static void main(String[] args) {
        //long count() method
        /*
        count is a reduction method which works on the finite stream
         */
        Stream<String> stringStream = Stream.of("Wajahat", "Zainab", "Zeeshan");
        System.out.println(stringStream.count());







    }
}
