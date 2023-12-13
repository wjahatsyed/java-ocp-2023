package chapter_06.supressed_exceptions;

/**
 * Created by Syed Wajahat on 12/24/2019.
 * Suppressed exceptions are only applied to exception in the Try block
 */
public class JammedTurkeyCage_3 implements AutoCloseable {
    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage doest not close");
    }

    public static void main(String[] args) {
        int count = 0;
        try (JammedTurkeyCage_3 jammedTurkeyCage_3 = new JammedTurkeyCage_3();
             JammedTurkeyCage_3 jammedTurkeyCage_31 = new JammedTurkeyCage_3()) {
            System.out.println("Turkeys entered cages");
        } catch (IllegalStateException e) {

            System.out.println(++count + e.getMessage());
            for (Throwable t : e.getSuppressed()) {
                System.out.println(++count + t.getMessage());
            }
        }
    }
}
