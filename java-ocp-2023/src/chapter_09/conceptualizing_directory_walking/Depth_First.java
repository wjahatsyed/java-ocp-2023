package chapter_09.conceptualizing_directory_walking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * Streams API uses Depth First search and are lazy. (lazy loading)
 * Difference between depth-first and breadth-first:
 * <p>
 * depth-first go to n levels to search a file or directory
 * breadth-first checks all nodes in a depth before going to next depth
 *
 * The Files.walk(path) method returns Stream<Path> and by default, it avoids
 * traversing the symbolic links to avoid cyclic path.
 * Avoiding FileSystemLoopException
 */
public class Depth_First {
    public static void main(String[] args) {
        Path path = Paths.get("/bigcats");
        try {
            Files.walk(path, 0).filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);
        } catch (IOException ex) {

        }
    }

}
