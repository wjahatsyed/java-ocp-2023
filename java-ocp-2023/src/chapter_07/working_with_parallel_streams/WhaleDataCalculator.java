package chapter_07.working_with_parallel_streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/30/2019.
 * This class is a comparison between outputs of serial and parallel streams.
 * The difference between the total time of execution is significant.
 * Use parallel streams when the stream size is large otherwise avoid because there
 * is a overhead cost of creating parallel streams
 */
public class WhaleDataCalculator {
    public int processRecord(int input) {
        try {
            //consider the following sleep as 10 milliseconds spent by the task to complete
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return input + 1;
    }

    public void processAllData(List<Integer> data) {

        //use serial stream
        data.stream().map(a -> processRecord(a)).count();
    }

    public void processAllData(List<Integer> data, boolean isParallel) {
        //use parallel stream
        if (isParallel) {
            data.parallelStream().map(a -> processRecord(a)).count();
        }
    }

    public static void main(String[] args) {
        WhaleDataCalculator whaleDataCalculator = new WhaleDataCalculator();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        //whaleDataCalculator.processAllData(list);
        //System.out.println("Time elapsed: " + (System.currentTimeMillis() - start) / 1000.0);
        //Above gives 42 seconds
        whaleDataCalculator.processAllData(list, true);
        //by Parallel streaming, it gives 5.5 seconds
        System.out.println("Total time elapsed: " +(System.currentTimeMillis()-start)/1000.0);

    }

}
