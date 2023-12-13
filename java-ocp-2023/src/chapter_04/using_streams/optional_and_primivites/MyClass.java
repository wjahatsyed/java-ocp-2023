package chapter_04.using_streams.optional_and_primivites;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Created by Syed Wajahat on 12/19/2019.
 */
public class MyClass {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 10);
        OptionalDouble optionalDouble = intStream.average();

        System.out.println(optionalDouble);

        //OptionalDouble is for primitive and Optional<Double> is for Double wrapper class

        //Use statistics


    }

    private static int range(IntStream ints) {
        IntSummaryStatistics intSummaryStatistics = ints.summaryStatistics();
        if(intSummaryStatistics.getCount() == 0){
            throw new RuntimeException();
        }
        return intSummaryStatistics.getMax() - intSummaryStatistics.getMin();
    }
}
