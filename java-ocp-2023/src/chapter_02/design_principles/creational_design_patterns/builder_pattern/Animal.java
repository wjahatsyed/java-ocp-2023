package chapter_02.design_principles.creational_design_patterns.builder_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/12/2019.
 * Animal class implemented using Immutable Objects Pattern
 */
public final class Animal {
    private String species;
    private int age;
    private List<String> favoriteFoods;

    public Animal(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public String getSpecies() {
        return this.species;
    }

    public int getAge() {
        return this.age;
    }

    public int getFavoritFoodsCount() {
        return this.favoriteFoods.size();
    }

    public String getFavFood(int index) {
        return this.favoriteFoods.get(index);
    }

}
