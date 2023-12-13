package chapter_06.using_try_with_resources.ThrowinfExample;

/**
 * Created by Syed Wajahat on 12/24/2019.
 */
public class Example_1 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Throwing exception");
    }

    //It has to declare Exception
    public static void main(String[] args) throws Exception {
        try (Example_1 example_1 = new Example_1(); Example_2 example_2 = new Example_2()) {

        }
    }
}
