package chapter_02.design_principles.creational_design_patterns.factory_pattern;

/**
 * Created by Syed Wajahat on 12/13/2019.
 */
public class FoodFactory {
    public static Food getFood(String name) {
        switch (name) {
            case "zebra":
                return new Hay(100);
            case "rabbit":
                return new Pellets(5);
            case "goat":
                return new Pellets(30);
            case "polar bear":
                return new Fish(10);
        }
        throw new UnsupportedOperationException("Unsupported Animal" + name);
    }
}
