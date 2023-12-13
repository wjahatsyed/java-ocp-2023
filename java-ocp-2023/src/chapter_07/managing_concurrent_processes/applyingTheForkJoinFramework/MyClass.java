package chapter_07.managing_concurrent_processes.applyingTheForkJoinFramework;

/**
 * Created by Syed Wajahat on 12/31/2019.
 * When a task becomes too complicated, we split the task into further sub tasks
 * using the Fork/Join framework.
 * <p>
 * Assume we know that we have 5 threads of zoo workers but we do not have any
 * idea of the number of tasks we/threads need to perform/complete.
 * <p>
 * Fork/Join framework relies on recursion
 */
public class MyClass {
    /*
    Recursion has two parts.
    1. Base case: The case to terminate the recursion
    2. Recursion case: The method calls itself one or multiple times.
    If the recursion case never reaches the base case, it can go into infinite
    recursion and StackOverFlow error can occur.
     */

    //Example of recursion
    /*
        5 * factorial(4)
        => 5 * (4 * factorial(3)
        => 5 * (4 * (3*factorial(2))
        => 5 * 4 * 3 * (2 * factorial(1))
        => 5 * 4 * 3 * 2 *1 = 120

     */
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}
