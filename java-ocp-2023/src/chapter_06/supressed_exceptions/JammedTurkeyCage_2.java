package chapter_06.supressed_exceptions;

/**
 * Created by Syed Wajahat on 12/24/2019.
 * catch block looks for primary exception cage
 * JAVA closed resources in reverse order
 * Suppressed exceptions are applied only to exception thrown in the try block
 */
public class JammedTurkeyCage_2 implements AutoCloseable {
    @Override
    public void close() throws IllegalStateException {
        //The first exception is primary Exception - Rest are suppressed exception
        throw new IllegalStateException("I am the suppressed");
    }

    public static void main(String[] args) {
        try (JammedTurkeyCage_2 jammedTurkeyCage_2 = new JammedTurkeyCage_2()) {
            throw new IllegalStateException("I am primary");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            for (Throwable t : e.getSuppressed()) {
                System.out.println(t.getMessage());
            }
        }
    }
}
