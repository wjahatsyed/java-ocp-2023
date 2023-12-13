package chapter_07;

/**
 * Created by Syed Wajahat on 12/26/2019.
 */
public class MyClass {
    public static void main(String[] args) {
        /*
        A process (JAVA program) can have multiple threads.
        There are two types of Threads (Thread class implements Runnable interface)
        System defined threads and user defined threads.

        All the processes are multi-threaded because in the background of every JAVA program (process),
        there are system defined threads running such as JVM garbage collector but we do not consider system
        defined threads so we say our applications are single threaded.

        Garbage collector thread is marked daemon thread. The JVM will stop the process (program) when only
        daemon threads are running and rest of the threads are done executing.

        Any thread can be marked daemon thread.

        A process can have multiples threads and a thread can have multiple tasks. A thread can complete
        multiple tasks but a task at a time.

        A thread is a smallest part of execution that can be scheduled by the OS Thread scheduler

        Multiple threads in a same process share the memory known as shared memory. These threads can communicate
        with each other directly.

        static method and variables are very useful.

        CPU Thread scheduler controls which thread will be executed from the Threads

        Round robin algorithm is used in which each thread has equal time to execute.
        In case the thread could not complete its tasks in given time, context switch is made in which the state of the
        thread is stored and next time the state is resumed to continue execution

        Thread priority is allotted when each thread is created. By default it is 5.
        Thread.NORM_PRIORITY = 5;
        Thread.MIN_PRIORITY = 1;
        Thread.MAX_PRIORITY = 10;


         */
    }
}
