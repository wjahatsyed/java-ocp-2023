package chapter_09.interacting_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * File copying is shallow - files in the same folder cannot be copied
 */
public class Fl_contents {
    public static void main(String[] args) {
        try {
            Files.copy(Paths.get("/panda"), Paths.get("/panda-save"));
            Files.copy(Paths.get("/panda/bamboo.txt"),
                    Paths.get("/panda-save/bamboo.txt"));
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
