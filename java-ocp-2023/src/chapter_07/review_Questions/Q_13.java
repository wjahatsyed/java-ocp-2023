package chapter_07.review_Questions;


import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 1/1/2020.
 * Outputs: 3,4
 */
public class Q_13 {
    public static void main(String[] args) {
        Stream<String> cats = Stream.of("leopard", "lynx", "ocelot", "puma").parallel();
        Stream<String> bears = Stream.of("panda", "grizzly", "polar").parallel();
        ConcurrentMap<Boolean, List<String>> data = Stream.of(cats, bears)
                .flatMap(s -> s)
                .collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));
        System.out.println(data.get(false).size() + " " + data.get(true).size());
    }
}
