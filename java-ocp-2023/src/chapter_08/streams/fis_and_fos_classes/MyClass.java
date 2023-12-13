package chapter_08.streams.fis_and_fos_classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Created by Syed Wajahat on 1/4/2020.
 * the read() method of FileInputStream returns int instead of byte because
 * -1 is used to indicate end of file has been reached.
 * This is copy file sample
 */
public class MyClass {
    public void copy(File source, File destination) {
        try (FileInputStream fileInputStream = new FileInputStream(source); FileOutputStream fileOutputStream
                = new FileOutputStream(destination)) {
            int b;
            while ((b = fileInputStream.read()) != -1) {
                fileOutputStream.write(b);
            }

        } catch (IOException ex) {

        }

    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        String parentPath = "E:\\";
        File source = new File(parentPath, "file.txt");
        File destination = new File(parentPath, "file" + LocalDate.of(2020, 04,01) + ".txt");
        myClass.copy(source, destination);

    }
}
