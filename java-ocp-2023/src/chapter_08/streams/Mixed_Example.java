package chapter_08.streams;

import java.io.*;

/**
 * Created by Syed Wajahat on 1/4/2020.
 * Wrapped Example:
 * FileInputStream wrapped into BufferedInputStream.
 * BufferedInputStream further wrapped into ObjectInputStream
 */
public class Mixed_Example {
    public static void main(String[] args) {
      /*  File file = new File("E:\\zoo.txt");
        if (file.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(
                    new FileInputStream(file)))) {
                Object object = objectInputStream.readObject();
                System.out.println(object.toString());

            } catch (IOException | ClassNotFoundException e) {
                //catch IOException because the InputStream abstract parent class implements the closeable
                //interface in which the close method throws IOException
            }
        }*/

        try{
            File file1 = new File("E:\\zoo.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
                    file1)));
            System.out.println(objectInputStream.readObject());
        } catch (IOException | ClassNotFoundException e){

        }

    }
}
