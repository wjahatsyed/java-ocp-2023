package chapter_09.interacting_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * delete() will throw exception if the directory or file does not exist or
 * if the directory is not empty
 * deleteIfExists() will throw exception if directory is not empty
 */
public class Delete {
    public static void main(String[] args) {
        try {
            Files.delete(Paths.get("/vulture/feathers.txt"));
            Files.deleteIfExists(Paths.get("/pigeon"));
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
