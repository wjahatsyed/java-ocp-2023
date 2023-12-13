package com.wajahat.ocp.review_questions;

/**
 * Created by Syed Wajahat on 1/6/2020.
 */

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountNumbers extends RecursiveAction {
    private int start;
    private int end;

    public CountNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    protected void compute() {
        if (start < 0) return;
        else {
            int middle = start + ((end - start) / 2);
            invokeAll(new CountNumbers(start, middle),
                    new CountNumbers(middle, end)); // m1
        }
    }

    public static void main(String[] args) {
        Stream<String> cats = Stream.of("leopard","lynx","ocelot","puma").parallel();
        Stream<String> bears = Stream.of("panda","grizzly","polar").parallel();
        ConcurrentMap<Boolean, List<String>> data = Stream.of(cats,bears)
                .flatMap(s -> s)
                .collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));
        System.out.println(data.get(false).size()+" "+data.get(true).size());
    }
}
