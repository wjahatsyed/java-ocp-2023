package chapter_04.built_in_functional_interfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Created by Syed Wajahat on 12/17/2019.
 */
public class Implementing_UnaryOperator_BinaryOperator {
    /*
    UnaryOperator extends Function - requires types to be same
    BinaryOperator extends BiFunction - requires types to same
     */

    public static void main(String[] args) {
        //Use UnaryOperator
        //Lambda
        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        //Method Reference
        unaryOperator = String::toUpperCase;

        System.out.println(unaryOperator.apply("Adil"));

        //Use BinaryOperator
        //Lambda
        BinaryOperator<String> binaryOperator = (a, b) -> a.concat(b);
        //Method Reference
        binaryOperator = String::concat;

        System.out.println(binaryOperator.apply("Waqar", "Younis"));




    }
}
