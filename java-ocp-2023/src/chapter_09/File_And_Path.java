package chapter_09;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class File_And_Path {
    public static void main(String[] args){
        File file = new File("pandas/cuddly.png");
        Path path = file.toPath();

        Path path1 = Paths.get("cuddly.png");
        File file1 = path1.toFile();
    }
}
