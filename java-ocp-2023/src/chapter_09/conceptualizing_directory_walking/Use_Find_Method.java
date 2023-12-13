package chapter_09.conceptualizing_directory_walking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * The find() method takes three parameters.
 * The path, int value for depth limit and BasicFileAttribute
 * This uses functional programming.
 */
public class Use_Find_Method {
    public static void main(String[] args) {
        Path path = Paths.get("/bigcats");
        long dateFilter = 1420070400000l;
        try {
            Stream<Path> stream = Files.find(path, 10,
                    (p, a) -> p.toString().endsWith(".java")
                            && a.lastModifiedTime().toMillis() > dateFilter);
            stream.forEach(System.out::println);
        } catch (Exception e) {
            // Handle file I/O exception...
        }
        //traversing a directory
        try {
            Path traversePath = Paths.get("ducks");
            Files.list(traversePath)
                    .filter(p -> !Files.isDirectory(p))
                    .map(p -> p.toAbsolutePath())
                    .forEach(System.out::println);
        } catch (IOException e) {

        }
    }
}
