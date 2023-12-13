package chapter_08.streams.related_to_inputstream__and_reader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Syed Wajahat on 1/4/2020.
 * The skipping method takes long and returns long as originally how many
 * bytes were skipped. It may return 0 or negative if the whole was already written.
 * The number of skipping must be used with large numbers as then it will use arrays
 * to access data which would be faster.
 * skip(long n) throws IOException
 */
public class Skipping_The_Stream {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\file.txt");
        //some input stream - read from the file
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        System.out.print((char) bufferedInputStream.read());
        bufferedInputStream.skip(2);
        bufferedInputStream.read();
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        //prints TRS

    }
}
