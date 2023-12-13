package chapter_07.creating_Threads.creating_threads_with_ExecutorService;

/**
 * Created by Syed Wajahat on 12/26/2019.
 */
public class MyClass {
    /*
    As previously discussed, there are three ways to create a thread.
    1. Create a runnable object class by implementing the Runnable interface and override the run method.
        Pass the object to the Thread constructor
    2. Create a runnable object class by extending the Thread class and override the run method.
       Create the object of runnable object and start it because it is in fact sub class of Thread
       so we can run the method => start() in the parent class.

    3. The third and recommended way to use the ExecutorService. It has Thread pooling and thread scheduler.
    We use shutDown() or shutdownNow() method
        Use execute(Runnable object or lambda)
        or use Future<?> submit(Runnable object or lambda)
        This returns that whether the thread has completed the execution of tasks or not
        //submit is recommended over execute


        //invokeAll() and invokeAny() - both take lists of Collections - both of them are synchronous
        //Means the method will wait for the result


     */
}
