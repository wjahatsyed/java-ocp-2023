package chapter_07.review_Questions;


import java.util.Arrays;

/**
 * Created by Syed Wajahat on 1/1/2020.
 */
public class Q10 {
    public static void main(String[] args){
        System.out.println(Arrays.asList("duck","chicken","flamingo","pelican")
                .parallelStream().parallel() // q1
                .reduce(0,
                        (c1, c2) -> c1 + c2.length(), // q2
                        (s1, s2) -> s1 + s2)); // q3
    }
}
