package chapter_08.review_questions;

import java.io.*;

/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class Q_1 {
    public static void main(String[] args) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream("zoo.txt"));
        InputStream wrapper = new ObjectInputStream(is);


    }
}
