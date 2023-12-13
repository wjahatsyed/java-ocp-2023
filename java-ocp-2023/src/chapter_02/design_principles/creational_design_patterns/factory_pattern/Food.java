package chapter_02.design_principles.creational_design_patterns.factory_pattern;

/**
 * Created by Syed Wajahat on 12/13/2019.
 */
public abstract class Food {
    private int quantity;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public abstract void consumed();
}
