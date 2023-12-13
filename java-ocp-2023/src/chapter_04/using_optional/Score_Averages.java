package chapter_04.using_optional;

import java.util.Optional;

/**
 * Created by Syed Wajahat on 12/18/2019.
 */
public class Score_Averages {
    public static void main(String[] args){
        Optional<Double> optional = getAverage(new int[]{2,4});
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
    }

    public static Optional<Double> getAverage(int... scores){
        if(scores.length == 0){
            return Optional.empty();
        }
        double sum = 0;
        for(int i: scores){
            sum += i;
        }
        return Optional.of(sum/scores.length);
    }
}
