package chapter_07.polling_with_sleep;

/**
 * Created by Syed Wajahat on 12/26/2019.
 * A Thread needs to poll for result - wait for the result from different thread
 * Solve the problem partially with sleep
 */
public class CheckResults {
    private static int count = 0;

    public static void main(String[] args) {
        new Thread(
                () -> {
                    for (int i = 0; i < 500; i++) {
                        count++;
                    }
                }
        );

        while (count < 100) {
            //There is a possibility for an infinite loop
            System.out.println("Not reached");
        }

        System.out.println("Reached");
    }
}
