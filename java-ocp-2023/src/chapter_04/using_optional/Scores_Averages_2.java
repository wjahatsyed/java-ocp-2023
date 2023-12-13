package chapter_04.using_optional;

import java.util.Optional;

/**
 * Created by Syed Wajahat on 12/18/2019.
 */
public class Scores_Averages_2 {
    public static void main(String[] args){
        Optional<Double> opt = Score_Averages.getAverage();
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(() -> Math.random()));
        System.out.println(opt.orElseThrow(()-> new IllegalStateException()));

    }
}
