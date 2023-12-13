package chapter_08.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Syed Wajahat on 1/4/2020.
 * Streams can be divided into low and high level streams
 * The classes with File keyword are low level.
 * The below class shows the concept of Wrapping.
 * <p>
 * From previous chapter:
 * AutoCloseable vs Closeable difference
 * AutoCloseable is an interface with have close method of void with Exception thrown
 * Closeable extends the AutoCloseable interface which has void method of close which throws IOException
 * Closeable is specific for IO
 */
public class Low_vs_High {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\zoo.txt");
        //either pass file instance or string.
        try (
                BufferedReader bufferedReader = new BufferedReader(
                        new FileReader(file))) {
            //read all lines
           bufferedReader.lines().forEach(System.out::println);

            //read one line
            System.out.println(bufferedReader.readLine());
        }
    }
}
