package chapter_04;

/**
 * Created by Syed Wajahat on 12/17/2019.
 */
@FunctionalInterface
public interface Gorilla {
    public abstract String move();

    class GorillaFamily {
        String walk = "walk";

        void everyonePlay(boolean baby) {
            String approach = "amble";
            approach = "Wajahat";

            play(() -> walk);
            play(() -> baby ? "hitch a ride" : "run");
            //variables used in lambda must be final or effectively final
            //play(()-> approach);
        }

        void play(Gorilla g) {
            System.out.println(g.move());
        }
    }

}
