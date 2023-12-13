package chapter_08.review_questions;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class Q_5 {
    public static void main(String[] args) throws IOException{
        String line;
        Console c = System.console();
        Writer w = c.writer();
        if ((line = c.readLine()) != null)
            w.append(line);
        w.flush();
    }

    public static void deleteTree(File file) {
        if(!file.isFile())
            for(File entry: file.listFiles())
                deleteTree(entry);
        else file.delete();
    }
}
