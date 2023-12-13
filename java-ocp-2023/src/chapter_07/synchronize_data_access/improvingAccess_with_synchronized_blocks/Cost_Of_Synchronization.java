package chapter_07.synchronize_data_access.improvingAccess_with_synchronized_blocks;

/**
 * Created by Syed Wajahat on 12/30/2019.
 */
public class Cost_Of_Synchronization {
    /*
    As we know, synchronization is a a monitor/lock that at most one thread must access/execute a part of code
    and acquire lock while accessing. The other threads would have to be queued and wait to acquire the lock.

    What if our class is highly concurrent - It has 50 threads and each thread takes 100 milliseconds to complete
    Which means that it will take total of 5 seconds. In these 5 seconds, more 50 threads can be created.

    Synchronization is protecting data at the cost of performance


     */
}
