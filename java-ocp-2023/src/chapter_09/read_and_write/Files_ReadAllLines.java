package chapter_09.read_and_write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class Files_ReadAllLines {
    public static void main(String[] args) {
        Path path = Paths.get("/fish/sharks.log");
        try {
            final List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
