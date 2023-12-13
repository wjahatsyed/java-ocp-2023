package chapter_06;

/**
 * Created by Syed Wajahat on 12/25/2019.
 */
class AhChoo {
    static class SneezeException extends Exception {
    }

    static class SniffleException extends SneezeException {
    }

    public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();
        } catch (SneezeException | RuntimeException e) {

            throw e;
        }
    }
}