package chapter_07.synchronize_data_access.improvingAccess_with_synchronized_blocks;


/**
 * Created by Syed Wajahat on 12/30/2019.
 * Synchronized block acquires a lock the block when on threads accesses it.
 * The coming new threads will have to acquire the same lock which the other thread possesses.
 *
 */
public class SheepManager_SB {
    public static void main(String[] args) {
        SheepManager_SB sheepManager_sb = new SheepManager_SB();
        synchronized (sheepManager_sb) {
            //at most one thread is executing the part of code
        }
    }
}
