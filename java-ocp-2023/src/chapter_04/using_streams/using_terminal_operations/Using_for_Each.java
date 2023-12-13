package com.wajahat.ocp.chapter_4.using_streams.using_terminal_operations;

import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/18/2019.
 */
public class Using_for_Each {
    /*
    Streams do not support traditional looping
    because they do not implement the Iterable interface

    We need to use foreach which is a non reduction terminal operation

     */
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Wajahat", "Syed", "Adil");
        stringStream.forEach(System.out::print);
    }
}
