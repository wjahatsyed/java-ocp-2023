package chapter_09.interacting_with_files;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * The Files factory/helper class is nio.2 and it
 * is not related to File class.
 * get also normalize.
 */
public class Example_1 {
    public static void main(String[] args) {
        Files.exists(Paths.get("/ostrich/feathers.png"));
        Files.exists(Paths.get("/ostrich"));
    }
}
