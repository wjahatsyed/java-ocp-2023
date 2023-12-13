package com.wajahat.ocp.chapter_4.using_streams.using_terminal_operations;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/18/2019.
 * reduce() is obviously reduction
 */
public class Using_reduce {
    public static void main(String[] args) {
        //Tough one here
        //First concatenate String of array into one string
        String[] array = new String[]{"w", "o", "l", "f"};
        String result = "";
        for (String s : array) {
            result += s;
        }
        System.out.println(result);

        //Now use Stream and reduce
        Stream<String> stringStream = Stream.of("w", "o", "l", "f");
        String sb = stringStream.reduce("", (a, b) -> a + b);
        System.out.println(sb);
        //String sc = stringStream.reduce("", String::concat);
        //System.out.println(sc);

        //Multiply all of Integer Objects in a stream
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        System.out.println(integerStream.reduce(1, (x, y) -> x * y));

        System.out.println("Do it");

        //Use reduce with streaming
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4);
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(integerStream1.reduce(1, binaryOperator, binaryOperator));

    }
}
