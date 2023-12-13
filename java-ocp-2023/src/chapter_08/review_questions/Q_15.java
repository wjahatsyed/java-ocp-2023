package chapter_08.review_questions;
import java.io.*;
/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class Q_15 {
    public static void main(String[] args){

    }

    private void echo() throws IOException {
        try (FileReader fileReader = new FileReader("zoo-data.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            System.out.println(bufferedReader.readLine());
        }
    }
}
