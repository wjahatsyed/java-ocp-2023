package chapter_08.files_and_directories;


import java.io.File;

/**
 * Created by Syed Wajahat on 1/4/2020.
 * Common and important methods used on File class instance
 */
public class ReadFileInformation {
    public static void main(String[] args) {
        //Use forward slash in JAVA or use \\ double back slash in String
        File file = new File("E:\\Learning Stuff\\OCP Related stuff");
        //check if directory exists
        System.out.println(file.exists());

        File myFile = new File("E:\\Learning Stuff\\OCP Related stuff\\myFile.txt");
        //get file name
        String nameOfFile = myFile.getName();
        System.out.println(nameOfFile);

        //get absolute path
        String absolutePath = myFile.getAbsolutePath();
        System.out.println(absolutePath);

        //check if directory
        Boolean isDirectory = myFile.isDirectory();
        System.out.println(isDirectory);

        //check if file
        Boolean isFile = myFile.isFile();
        System.out.println(isFile);

        //get length in bytes (long)
        long length = myFile.length();
        System.out.println(length);

        //get last modified - epoch in long
        long lastModified = myFile.lastModified();
        System.out.println(lastModified);

        //delete file - returns boolean
        //myFile.delete();

        //myFile.renameTo();

        System.out.println(myFile.getParent());

        File myFolder = new File("E:\\Learning Stuff\\");

        File[] files = myFolder.listFiles();
        for(File file1 : files){
            System.out.println(file1.getName());
        }




    }
}
