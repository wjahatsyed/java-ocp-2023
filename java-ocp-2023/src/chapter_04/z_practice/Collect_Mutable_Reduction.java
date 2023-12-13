package chapter_04.z_practice;

import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 1/2/2020.
 */
public class Collect_Mutable_Reduction {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Wajahat", "Adil", "Syed");
        //With Lambda
        StringBuilder sb = stringStream.collect(StringBuilder::new, (c1, c2) -> c1.append(c2), (c3, c4) ->
                c3.append(c4));
        System.out.println(sb);

        //With Method Reference
      /*  StringBuilder sb2 = stringStream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(sb2);*/
    }
}
