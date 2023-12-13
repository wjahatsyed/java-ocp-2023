package chapter_08;

import java.io.Console;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Syed Wajahat on 1/5/2020.
 */
public class The_Console_Class {
    public static void main(String[] args) throws IOException{
        Console console = System.console();
            if(console==null){
                throw new RuntimeException("Console not available");
            }
        console.writer().print("Wajahat");

        String line;
        Console c = System.console();
        Writer w = c.writer();
        if ((line = c.readLine()) != null)
            w.append(line);
        w.flush();

    }
}
