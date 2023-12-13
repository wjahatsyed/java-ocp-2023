package chapter_09.understanding_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class Modification {
    public static void main(String[] args) {
        try {
            final Path path = Paths.get("/rabbit/food.jpg");
            System.out.println(Files.getLastModifiedTime(path).toMillis());
            Files.setLastModifiedTime(path,
                    FileTime.fromMillis(System.currentTimeMillis()));
            System.out.println(Files.getLastModifiedTime(path).toMillis());
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }


}
