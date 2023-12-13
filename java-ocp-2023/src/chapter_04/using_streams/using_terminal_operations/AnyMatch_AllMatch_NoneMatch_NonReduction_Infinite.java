package com.wajahat.ocp.chapter_4.using_streams.using_terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/18/2019.
 */
public class AnyMatch_AllMatch_NoneMatch_NonReduction_Infinite {
    //They work with both finite and infinite stream
    public static void main(String[] args) {
        //All three takes predicate
        //Check if the finite and infinite streams start with a letter
        List<String> animalNames = Arrays.asList("Goat", "Sheep", "2Cheetah");
        Stream<String> inifinte = Stream.generate(() -> "Monkey");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(animalNames.stream().anyMatch(pred));
        System.out.println(animalNames.stream().noneMatch(pred));
        System.out.println(animalNames.stream().allMatch(pred));

        System.out.println(inifinte.anyMatch(pred));


    }
}
