package chapter_04.using_streams.using_terminal_operations;

import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/18/2019.
 */
public class Use_Count_Finite_Reduction {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Wajahat", "Zainab", "Zeeshan");
        //Count is a reduction function works on finite stream
        System.out.println(stringStream.count());
    }
}
