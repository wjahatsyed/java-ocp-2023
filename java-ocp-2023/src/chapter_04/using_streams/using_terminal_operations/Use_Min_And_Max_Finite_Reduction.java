package chapter_04.using_streams.using_terminal_operations;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 12/18/2019.
 * min and max are both reduction (terminal operation) and they
 * work on finite stream
 */
public class Use_Min_And_Max_Finite_Reduction {
    public static void main(String[] args) {
        Stream<String> myStream = Stream.of("Wajahat", "Adil", "Nuzhar");
        Optional<String> opt = myStream.min((s1, s2) -> s1.length() - s2.length());
        System.out.println(opt.orElse("No Minimum Found"));
        opt.ifPresent(System.out::println);
        System.out.println(opt.get());

    }
}
