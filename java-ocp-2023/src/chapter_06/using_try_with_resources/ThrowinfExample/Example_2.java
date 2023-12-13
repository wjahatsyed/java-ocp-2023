package chapter_06.using_try_with_resources.ThrowinfExample;

/**
 * Created by Syed Wajahat on 12/24/2019.
 */
public class Example_2 implements AutoCloseable{
    @Override
    public void close() throws IllegalArgumentException {
        System.out.println("Running close");
    }
    //No need to declare IllegalArgumentException
    public static void main(String[] args){
        try(Example_2 example_2 = new Example_2()){

        }
    }
}
