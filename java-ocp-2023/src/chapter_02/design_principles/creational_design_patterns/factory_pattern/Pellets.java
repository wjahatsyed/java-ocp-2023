package chapter_02.design_principles.creational_design_patterns.factory_pattern;

/**
 * Created by Syed Wajahat on 12/13/2019.
 */
public class Pellets extends Food {
    public Pellets(int quantity){
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Pellets eaten: "+getQuantity());
    }
}
