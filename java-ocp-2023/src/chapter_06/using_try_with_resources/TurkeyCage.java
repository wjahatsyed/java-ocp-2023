package chapter_06.using_try_with_resources;

/**
 * Created by Syed Wajahat on 12/24/2019.
 * close method should not throw Exception as it will require try block's method to throw the exception as well
 */
public class TurkeyCage implements AutoCloseable {
    @Override
    public void close() throws IllegalArgumentException{
        System.out.println("Implementing auto-close");
        //close should not change state
    }

    public static void main(String[] args) {
        try (TurkeyCage turkeyCage = new TurkeyCage()) {

        }
    }
}
