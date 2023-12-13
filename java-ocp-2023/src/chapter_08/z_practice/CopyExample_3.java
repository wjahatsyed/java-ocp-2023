package chapter_08.z_practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 1/4/2020.
 * Using FileReader and FileWriter
 * wrapped in BufferedFileReader and BufferedFileWriter
 */
public class CopyExample_3 {
    public static List<String> readFile(File source) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                list.add(s);
            }
        }
        return list;
    }

    public static void saveFile(List<String> data, File destination) throws IOException {
        data.forEach(System.out::println);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                destination
        ))) {
            for (String s : data) {
                bufferedWriter.write(s);
            }
        }
    }

    public static void main(String[] args) {
        try {
            File parentDirectory = new File("E:\\");
            File source = new File(parentDirectory, "Book1.csv");
            File destination = new File(parentDirectory, "Book2.csv");
            saveFile(readFile(source), destination);

        } catch (IOException ex) {

        }

    }
}
