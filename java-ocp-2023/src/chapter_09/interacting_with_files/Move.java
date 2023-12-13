package chapter_09.interacting_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class Move {
    public static void main(String[] args) {
        try {
            Files.move(Paths.get("c:\\zoo"), Paths.get("c:\\zoo-new"));
            Files.move(Paths.get("c:\\user\\addresses.txt"),
                    Paths.get("c:\\zoo-new\\addresses.txt"));
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
