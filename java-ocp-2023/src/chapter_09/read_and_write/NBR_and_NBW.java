package chapter_09.read_and_write;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * newBufferedReader and newBufferedWriter
 * We can use Charset.defaultCharset()
 */
public class NBR_and_NBW {
    public static void main(String[] args) {
        Path path = Paths.get("/animals/gopher.txt");
        try (BufferedReader reader = Files.newBufferedReader(path,
                Charset.forName("US-ASCII"))) {
            // Read from the stream
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null)
                System.out.println(currentLine);
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
