package chapter_02.design_principles.creational_design_patterns.factory_pattern;

/**
 * Created by Syed Wajahat on 12/13/2019.
 */
public class Hay extends Food {
    public Hay(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Hay eaten:" + this.getQuantity());
    }
}
