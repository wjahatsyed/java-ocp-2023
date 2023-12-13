package chapter_02.design_principles.creational_design_patterns.singleton;

/**
 * Created by Syed Wajahat on 12/12/2019.
 */
public class VisitorTicketTracker_TS_ {
    /*
    Use volatile keyword to ensure the compiler does not apply
    optimization on this instance variable
     */
    private volatile static VisitorTicketTracker_TS_ instance;

    private VisitorTicketTracker_TS_() {

    }

    public static VisitorTicketTracker_TS_ getInstance() {
        if (instance == null) {
            synchronized (VisitorTicketTracker_TS_.class) {
                if (instance == null) {
                    instance = new VisitorTicketTracker_TS_();
                }
            }
        }
        return instance;
    }
}
