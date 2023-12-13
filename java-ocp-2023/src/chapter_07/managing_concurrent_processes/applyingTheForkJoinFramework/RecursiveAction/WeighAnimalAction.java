package chapter_07.managing_concurrent_processes.applyingTheForkJoinFramework.RecursiveAction;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

/**
 * Created by Syed Wajahat on 12/31/2019.
 * Example of fork/join framework
 * <p>
 * Three steps to apply the fork/join framework
 * 1. Create the ForkJoinTask
 * 2. Create the ForkJoinPool
 * 3. Start the ForkJoin task
 * <p>
 * The concept it to subdivide the tasks and submit to for execution
 * <p>
 * For implementing the fork/join framework, we need to extend either of
 * the two following classes:
 * 1. RecursiveAction
 * 2. RecursiveTask
 * <p>
 * Both the above classes implement the ForkJoinTask interface
 * <p>
 * In RecursiveAction, we use the invokeAll method
 */
public class WeighAnimalAction extends RecursiveAction {
    private int start;
    private int end;
    private Double[] weights;

    public WeighAnimalAction(Double[] weights, int start, int end) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }

    @Override
    protected void compute() {
        if (end - start <= 3) {
            for (int i = start; i < end; i++) {
                weights[i] = (double) new Random().nextInt(100);
                System.out.println("Animal Weighed: " + i);

            }
        } else {
            int middle = start + ((end - start) / 2);
            System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
            invokeAll(new WeighAnimalAction(weights, start, middle),
                    new WeighAnimalAction(weights, middle, end));

        }
    }

    public static void main(String[] args) {
        Double[] animals = new Double[10];

        //3 steps
        ForkJoinTask<?> task = new WeighAnimalAction(animals, 0, animals.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);

        System.out.println();
        System.out.print("Weights: ");
        //print weights

        Arrays.asList(animals).stream().forEach(d -> System.out.print(d + " "));


    }
}
