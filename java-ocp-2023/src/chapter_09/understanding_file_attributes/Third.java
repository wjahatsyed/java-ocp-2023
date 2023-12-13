package chapter_09.understanding_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * size() method returns long
 */
public class Third {
    public static void main(String[] args) {
        try {
            System.out.println(Files.size(Paths.get("/zoo/c/animals.txt")));
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
