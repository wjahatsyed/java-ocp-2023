package chapter_08.z_practice;

import java.io.*;

/**
 * Created by Syed Wajahat on 1/4/2020.
 * Example with BufferedInputStream and BufferedOutputStream
 */
public class CopyExample2 {
    public static void main(String[] args) {
        File parentPath = new File("E:\\");
        File source = new File(parentPath, "file.txt");
        File destination = new File(parentPath, "file-wajahat-2.txt");
        try {
            copyFile(source, destination);
        } catch (IOException ioe) {

        }

    }

    public static void copyFile(File source, File destination) throws IOException {
        try (
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = bufferedInputStream.read(buffer)) > 0) {
                bufferedOutputStream.write(buffer, 0, readLength);
            }

        }


    }
}
