package chapter_07.creating_Threads.creating_threads_with_ExecutorService.introducing_callable;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * Created by Syed Wajahat on 12/27/2019.
 */
public class AmbiguousLambdaSample {
    public static void useSupplier(Supplier<Integer> expression) {
    }

    public static void useCallable(Callable<Integer> expression) {
    }

    public static void use(Supplier<Integer> supplier) {
    }

    public static void use(Callable<Integer> callable) {
    }

    public static void main(String[] args) {
        useCallable(() -> {
            throw new IOException();
        });
        //Does not compile
       /* useSupplier(() -> {
                    throw new IOException();
                }
        );*/
        useSupplier(() -> new Integer(15));
        //Following does not compile as well
        //use(() ->{throw new IOException();});
        //Solution: Type Cast
        use((Callable<Integer>) () -> {
            throw new IOException();
        });

        use((Supplier<Integer>) () -> 1);

    }
}
