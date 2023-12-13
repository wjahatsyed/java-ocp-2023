package chapter_08.z_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Syed Wajahat on 1/4/2020.
 * practice-1
 */
public class CopyExample1 {

    public static void main(String[] args) {
        File parentPath = new File("E:\\");
        File source = new File(parentPath, "file.txt");
        File destination = new File(parentPath, "file-wajahat.txt");
        try {
            copyFile(source, destination);
        } catch (IOException ex) {

        }
    }

    public static void copyFile(File source, File destination) throws IOException {
        try (
                FileInputStream fileInputStream = new FileInputStream(source);
                FileOutputStream fileOutputStream = new FileOutputStream(destination)
        ) {
            int b;
            while ((b = fileInputStream.read()) > 0) {
                fileOutputStream.write(b);
            }


        }

    }
}
