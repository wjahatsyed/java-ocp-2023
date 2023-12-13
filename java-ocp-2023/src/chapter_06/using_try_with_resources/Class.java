package chapter_06.using_try_with_resources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by Syed Wajahat on 12/24/2019.
 * Try with resources introduced in JAVA 7
 */
public class Class {
    public static void main(String[] args) {
        /*
        Resources are automatically closed using try with resources block
        We can omit catch and finally
         */
    }

    public void newApproach(Path path1, Path path2) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(path1);
             BufferedWriter out = Files.newBufferedWriter(path2)) {
            out.write(in.readLine());
            //Implicit finally block runs before any explicit final block

        }

    }
}
