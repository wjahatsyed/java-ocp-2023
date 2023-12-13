package chapter_09.conceptualizing_directory_walking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * lines() return data in Stream and lazily so it is better with large files
 * as compare to readAllLines()
 */
public class Lines {
    public static void main(String[] args) {
        Path path = Paths.get("/fish/sharks.log");
        try {
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
