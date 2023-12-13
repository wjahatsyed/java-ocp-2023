package chapter_02.design_principles.encapsulating_data;
/**
 * Created by Syed Wajahat on 12/11/2019.
 */
public class Animal extends java.lang.Object {
    /*
    Two invariants to be protected:
    1. Animal name cannot be null or empty
    2. Animal age cannot be negative
     */

    private String species;
    private int age;

    public Animal(String species) {
        this.setSpecies(species);
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (species == null || species.trim().length() == 0) {
            throw new IllegalArgumentException("String cannot be empty");
        }
        this.species = species;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }
}
