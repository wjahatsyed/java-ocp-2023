package chapter_02.design_principles.creational_design_patterns.immutable_objects_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/12/2019.
 */
public final class Animal {
    private final String species;
    private final int age;
    private final List<String> favoriteFood;

    public Animal(String species, int age, List<String> favoriteFood) {
        this.species = species;
        this.age = age;
        //To ensure that the caller and immutable object do not have the same reference to the ArrayList object
        this.favoriteFood = new ArrayList<>(favoriteFood);
    }

    public String getSpecies() {
        return this.species;
    }

    public int getAge() {
        return this.age;
    }

    public int getFavoriteFoodCount() {
        return this.favoriteFood.size();
    }

    public String getFavoriteFood(int index) {
        return this.favoriteFood.get(index);
    }

}
