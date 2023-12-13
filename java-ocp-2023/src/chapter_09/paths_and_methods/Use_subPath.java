package chapter_09.paths_and_methods;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * Use subPath(int, int) method
 * Does not include the root path of the file
 * . for current directory
 * .. for parent directory
 */
public class Use_subPath {
    public static void main(String[] args) {
        Path path = Paths.get("/mammal/carnivore/raccoon.image");
        System.out.println("Path is: " + path);
        System.out.println("Subpath from 0 to 3 is: " + path.subpath(0, 3));
        System.out.println("Subpath from 1 to 3 is: " + path.subpath(1, 3));
        System.out.println("Subpath from 1 to 2 is: " + path.subpath(1, 2));
    }
}

