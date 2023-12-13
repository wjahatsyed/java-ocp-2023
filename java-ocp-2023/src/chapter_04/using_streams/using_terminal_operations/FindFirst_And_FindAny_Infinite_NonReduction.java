package com.wajahat.ocp.chapter_4.using_streams.using_terminal_operations;

import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/18/2019.
 */
public class FindFirst_And_FindAny_Infinite_NonReduction {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Wajahat", "Zeeshan", "Ahmer");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        //Findfirst helps in Parallel streams - It returns the first element which is available
        //not depending on which one has to be first according to the stream
    }
}
