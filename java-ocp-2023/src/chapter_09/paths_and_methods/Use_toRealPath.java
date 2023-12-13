package chapter_09.paths_and_methods;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * check if the file actually exists
 * It is also the only Path method to support the NOFOLLOW_LINKS option.
 * Similar to the toAbsolutePath() method but toRealPath() also checks if the file exists
 * It also implicitly calls the normalize method
 */
public class Use_toRealPath {
    public static void main(String[] args) {
        try {
            System.out.println(Paths.get("/zebra/food.source").toRealPath());
            System.out.println(Paths.get(".././food.txt").toRealPath());
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
