package chapter_02.design_principles.creational_design_patterns.builder_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/12/2019.
 */
public class MyClass {
    /*
    The solution to Telescoping constructor anti-pattern
    is builder pattern
     */

    public static void main(String[] args) {
        AnimalBuilder fishBuilder = new AnimalBuilder();
        List<String> foodList = new ArrayList<>();
        foodList.add("some food");
        Animal fish = fishBuilder.setAge(25).setFavFoods(foodList).setSpecies("Dolphin").build();

        Animal fish2 = new AnimalBuilder().setAge(25).setFavFoods(foodList).setSpecies("Dolphin").build();

        if (fish == fish2) {
            System.out.println("Objects are not immutable");
        } else if (fish.equals(fish2)) {
            System.out.println("Not immutable");
        } else {
            System.out.println("fish and fish2 both are immutable objects");
        }

    }
}
