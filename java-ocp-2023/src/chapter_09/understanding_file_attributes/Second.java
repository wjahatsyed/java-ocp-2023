package chapter_09.understanding_file_attributes;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * Check File accessibility with isReadable(path)
 * and also isExecutable(path)
 * Following 5 methods do not throw Exception instead return false if file/directory
 * does not exist.
 * isDirectory(), isRegularFile(), isSymbolicLink(), isReadable() and isExecutable
 */
public class Second {
    public static void main(String[] args) {
        System.out.println(Files.isReadable(Paths.get("/seal/baby.png")));
        System.out.println(Files.isExecutable(Paths.get("/seal/baby.png")));
    }
}
