package chapter_06.supressed_exceptions;

/**
 * Created by Syed Wajahat on 12/24/2019.
 */
public class Example implements AutoCloseable{
    @Override
    public void close() throws Exception{
        System.out.println("Testing");
    }
    public static void main(String[] args) throws Exception{
        try(Example example = new Example()){
            //finally block will run
        }finally {
            System.out.println("Wajahat");
        }
    }
}
