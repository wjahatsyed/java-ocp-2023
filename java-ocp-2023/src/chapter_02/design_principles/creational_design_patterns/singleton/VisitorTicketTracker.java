package chapter_02.design_principles.creational_design_patterns.singleton;

/**
 * Created by Syed Wajahat on 12/12/2019.
 */
public class VisitorTicketTracker {
    private VisitorTicketTracker() {
    }

    private static VisitorTicketTracker instance;

    public static VisitorTicketTracker getInstance() {
        if (instance == null) {
            instance = new VisitorTicketTracker();
            //The above is not threads-safe
        }

        return instance;
    }
}
