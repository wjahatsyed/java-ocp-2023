package chapter_08.streams.f_r_and_f_w_classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 1/4/2020.
 * Use BufferedReader, FileReader, BufferedWriter and FileWriter
 */
public class CopyTextFileExample {
    public static void main(String[] args) {
        String parentPath = "E:\\";
        File source = new File(parentPath, "Book1.csv");
        File destination = new File(parentPath, "Book2.txt");
        try {
            writeFile(readFile(source), destination);
        } catch (IOException ioe) {

        }
    }

    public static List<String> readFile(File source) throws IOException {
        List<String> data = new ArrayList<>();
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(source))
        ) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                data.add(s);
            }
        }
        return data;
    }

    public static void writeFile(List<String> data, File destination) throws IOException {
        data.forEach(System.out::println);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))) {
            for (String s : data) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        }
    }
}
