package chapter_09.interacting_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 * createDirectory() is alternate of makdir() and mkdirs()
 */
public class Cr_Directories {
    public static void main(String[] args){
        try {
            //will throw exception if bison does not exist or field already exists
            Files.createDirectory(Paths.get("/bison/field"));
            //will throw exception if green already exists - create the other directories (parent)
            //if not exist
            Files.createDirectories(Paths.get("/bison/field/pasture/green"));
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
