package chapter_08.streams.bis_bos_classes;

import java.io.*;
import java.time.LocalDate;

/**
 * Created by Syed Wajahat on 1/4/2020.
 * copy file revised version
 * The same example of bytes can be used with FileInputStream read(byte[] b) overloading
 * but that is still going to be single byte at a time.
 */
public class CopyBufferFileClass {
    public static void copy(File source, File destination) throws IOException {
        try (
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] buffer = new byte[3];
            int lengthRead;
            while ((lengthRead = bufferedInputStream.read(buffer)) > 0) {
                bufferedOutputStream.write(buffer, 0, lengthRead);
                bufferedOutputStream.flush();
            }
        }
    }

    public static void main(String[] args) {
        String parentPath = "E:\\";
        File source = new File(parentPath, "file.txt");
        File destination = new File(parentPath, "file" + LocalDate.of(2020, 04, 012) + ".txt");
        try {
            CopyBufferFileClass.copy(source, destination);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
