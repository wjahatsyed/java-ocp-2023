package chapter_09.conceptualizing_directory_walking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * A more powerful example
 */
public class LinesAnotherExample {
    public static void main(String[] args) {
        Path path = Paths.get("/fish/sharks.log");

        try {
            System.out.println(Files.lines(path)
                    .filter(s -> s.startsWith("WARN "))
                    .map(s -> s.substring(5)).collect(Collectors.toList()));
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
