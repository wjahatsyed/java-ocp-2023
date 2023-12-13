package com.wajahat.ocp.review_questions;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

/**
 * Created by Syed Wajahat on 1/6/2020.
 */
public class Two {
    public static void main(String[]args) throws InterruptedException, ExecutionException{
        Integer i1 = Arrays.asList(1,2,3,4,5).stream().findAny().get();
        synchronized(i1) { // y1
            Integer i2 = Arrays.asList(6,7,8,9,10)
                    .parallelStream()
                    .sorted() // y2
                    .findAny().get(); // y3
            System.out.println(i1+" "+i2);
        }
    }
}
