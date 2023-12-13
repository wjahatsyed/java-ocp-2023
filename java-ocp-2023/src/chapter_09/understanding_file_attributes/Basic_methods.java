package chapter_09.understanding_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * In windows OS, the property of isHidden is set true. That isHidden property is system dependent
 * In MacOS and Linux based system, a . period in start of the name of the file represents the
 * hidden property.
 */
public class Basic_methods {
    public static void main(String[] args) {
        Files.isDirectory(Paths.get("/canine/coyote/fur.jpg"));
        Files.isRegularFile(Paths.get("/canine/types.txt"));
        Files.isSymbolicLink(Paths.get("/canine/coyote"));

        try {
            System.out.println(Files.isHidden(Paths.get("/walrus.txt")));
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
