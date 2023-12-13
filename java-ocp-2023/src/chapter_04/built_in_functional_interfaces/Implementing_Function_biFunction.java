package chapter_04.built_in_functional_interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Syed Wajahat on 12/17/2019.
 */
public class Implementing_Function_biFunction {
    /*
    Function and BiFunction Return R
     */

    public static void main(String[] args) {
        //Lambda
        Function<String, Integer> function = s -> s.length();
        //Method Reference
        function = String::length;

        String s = "I am a string";
        System.out.println(function.apply(s));

        //Lambda
        BiFunction<String, String, String> biFunction = (t, v) -> t.concat(v);
        //Method Reference
        biFunction = String::concat;
        System.out.println(biFunction.apply("Wajahat", " Syed"));


    }
}
