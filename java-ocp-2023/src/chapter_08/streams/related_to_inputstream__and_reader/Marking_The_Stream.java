package chapter_08.streams.related_to_inputstream__and_reader;


import java.io.*;

/**
 * Created by Syed Wajahat on 1/4/2020.
 * These are for input/read classes:
 * Use markSupported() which returns boolean.
 * If markSupported() does not return true then an exception can occur
 * at runtime using the mark(int n) method.
 * Use the mark(int n) with small int values - read limit - must be small
 * Use the reset method to read back from the earlier position.
 * Note: An exception may be thrown when the mark is invalidated. Not always.
 */
public class Marking_The_Stream {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\file.txt");
        //some input stream - read from the file
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        System.out.print((char) bufferedInputStream.read());
        //check if mark supported
        if(bufferedInputStream.markSupported()){
            //can read data of 100 bytes then the mark will become invalid
            bufferedInputStream.mark(100);
            System.out.print((char) bufferedInputStream.read());
            System.out.print((char) bufferedInputStream.read());
            bufferedInputStream.reset();
            System.out.print((char) bufferedInputStream.read());
            System.out.print((char) bufferedInputStream.read());
            System.out.println((char) bufferedInputStream.read());
            System.out.println((char) bufferedInputStream.read());
            //prints


        }



    }

}
