package chapter_08.files_and_directories;

import java.io.File;

/**
 * Created by Syed Wajahat on 1/3/2020.
 * Windows uses \ as file separator
 * Unix-based systems use / (forward slash) as separator
 * Two ways are there to retrieve the separator in the
 * following example
 */
public class File_Separator {
    public static void main(String[] args) {
        //Use System property
        String separator_1 = System.getProperty("file.separator");
        System.out.println(separator_1);
        //Use static method of File class
        String separator_2 = File.separator;
        System.out.println(separator_2);
    }
}
