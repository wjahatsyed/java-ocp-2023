package chapter_03.comparable_and_comparator.comparable;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class Animal implements Comparable<Animal> {
    private int id;

    public Animal(int id){
        this.id = id;
    }

    @Override
    public int compareTo(Animal animal) {
        return this.id - animal.id;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal(25);
        Animal animal2 = new Animal(10);
        System.out.println(animal1.compareTo(animal2));
    }
}
