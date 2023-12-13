package chapter_02.design_principles.creational_design_patterns.builder_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/12/2019.
 * AnimalBuilder class tightly coupled with Animal class implemented Builder Pattern
 * AnimalBuilder class is mutable resulting in returning an immutable Animal class object
 * We will use setter methods instead of constructor and have a build method
 * This works with method chaining
 */
public class AnimalBuilder {
    private String species;
    private int age;
    private List<String> favoriteFoods;

    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public AnimalBuilder setFavFoods(List<String> favoriteFoods) {
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
        return this;
    }

    public Animal build() {
        return new Animal(species, age, favoriteFoods);
    }


}
