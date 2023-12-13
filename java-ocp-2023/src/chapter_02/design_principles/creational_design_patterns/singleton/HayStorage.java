package chapter_02.design_principles.creational_design_patterns.singleton;

/**
 * Created by Syed Wajahat on 12/12/2019.
 */
public class HayStorage extends Object {
    private int quantity = 0;

    private HayStorage() {
        super();
    }

    private static final HayStorage instance = new HayStorage();

    public static HayStorage getInstance() {
        return instance;
    }

    public synchronized void addHay(int amount) {
        quantity += amount;
    }

    public synchronized int getQuantity() {
        return this.quantity;
    }

    public synchronized boolean removeHay(int amount) {
        if (quantity < amount) {
            return false;
        }
        quantity -= amount;
        return true;
    }

}
