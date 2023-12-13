package chapter_06.supressed_exceptions;

/**
 * Created by Syed Wajahat on 12/24/2019.
 */
public class JammedTurkeyCage implements AutoCloseable {
    /*
    If close throws any Checked exception then the main method here would have to declare or handle the Checked Exception
     */
    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Hello");
    }

    public static void main(String[] args) {
        try (JammedTurkeyCage jammedTurkeyCage = new JammedTurkeyCage()) {

        } catch (IllegalStateException e) {
           e.printStackTrace();
        }
    }
}
