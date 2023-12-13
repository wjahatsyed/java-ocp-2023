package chapter_07.creating_Threads.increasing_concurrency_with_pools;

/**
 * Created by Syed Wajahat on 12/29/2019.
 * Total 5 Methods of the Executors factory class
 * newSingleThreadExecutor - ExecutorService
 * newSingleThreadScheduledExecutor - ScheduledExecutorService
 * newCachedThreadPool - ExecutorService
 * newFixedThreadPool(int nThreads) - ExecutorService
 * newScheduledThreadPool(int nThreads) - ScheduledExecutorService
 */
public class Choose_Pool_Size {
    /*
    Pool size of a thread pool depends on the CPu usage they require.
    If your threads are CPU intensive then the number of threads in the pool must be less.

    If your threads are more dependent on external resources rather than the CPU then there
    can be more threads in the pool.

     */
    public static void main(String[] args){
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

}
