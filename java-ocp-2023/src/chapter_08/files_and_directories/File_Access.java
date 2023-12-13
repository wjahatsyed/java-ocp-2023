package chapter_08.files_and_directories;

import java.io.File;

/**
 * Created by Syed Wajahat on 1/3/2020.
 * Use 2 constructors of File class to create a File object
 * with directory/file path
 */
public class File_Access {
    public static void main(String[] args) {
        File file = new File("c:/sonarqube-7.6/");
        System.out.println(file.exists());

        File parentPath = new File("c:/sonarqube-7.6/");
        File file1 = new File(parentPath, "bin/linux-x86-32");

        System.out.println(file1.exists());

        //If parent path is null, single constructor will be considered.
    }
}
