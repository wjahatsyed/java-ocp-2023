package chapter_09.read_and_write;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class Write_to_file {
    public static void main(String[] args) {
        Path path = Paths.get("/animals/gorilla.txt");
        List<String> data = new ArrayList();
        try (BufferedWriter writer = Files.newBufferedWriter(path,
                Charset.forName("UTF-16"))) {
            writer.write("Hello World");
        } catch (IOException e) {
        // Handle file I/O exception...
        }
    }
}
