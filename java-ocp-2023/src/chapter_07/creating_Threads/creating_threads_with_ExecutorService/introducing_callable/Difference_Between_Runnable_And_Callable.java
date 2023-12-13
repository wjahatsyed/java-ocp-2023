package chapter_07.creating_Threads.creating_threads_with_ExecutorService.introducing_callable;

/**
 * Created by Syed Wajahat on 12/27/2019.
 */
public class Difference_Between_Runnable_And_Callable {
    /*
        Runnable is in the java.lang package
        It is a functional interface
        The run() method is void and does not take any parameter/argument

        Callable is in the java.util.Concurrent package
        It is a functional interface
        The call() method takes 0 argument, returns V and throws Exception

        Callable is similar to Supplier except that run method of Callable throws Ecception
        while Supplier method get() does not throw any Checked exception

     */
}
