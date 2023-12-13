package chapter_04.using_streams.working_with_primitives.functional_interfaces_for_primitives;

import java.util.function.BooleanSupplier;
import java.util.function.IntToDoubleFunction;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class MyClass {
    //BooleanSupplier
    public static void main(String[] args) {
        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean());

        BooleanSupplier booleanSupplier1 = () -> Math.random() > 1;
        System.out.println(booleanSupplier1.getAsBoolean());

        //For every functional interface of Wrapper, we have same for
        //primitive but with different name - exact primitive type

        //BiConsumer, BiPredicate and BiFunction are not available in primitives
        int i = 1;
        IntToDoubleFunction function = x -> 1.5;
        function.applyAsDouble(i);
    }

}
