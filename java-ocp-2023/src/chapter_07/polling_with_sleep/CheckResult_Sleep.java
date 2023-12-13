package chapter_07.polling_with_sleep;

/**
 * Created by Syed Wajahat on 12/26/2019.
 * Thread.sleep lets the thread rest.
 */
public class CheckResult_Sleep {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                counter++;
            }
        });

        while (counter < 100) {
            System.out.println("Not Reached");
            //This will let the thread opened by main method to sleep for 1 second
            Thread.sleep(100);
        }

        System.out.println("reached");

    }
}
