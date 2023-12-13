package chapter_02.predicate_interface;

import chapter_02.functional_programming.implementing_functional_interfaces_with_lambdas.Animal;

import java.util.function.Predicate;

/**
 * Created by Syed Wajahat on 12/10/2019.
 */
public class FindMatchingAnimals {
    /*
    We are using the Predicate functional interface which has a test
    method and uses Type T parameter - i.e. works with generics
     */
    private static void print(Animal animal, Predicate<Animal> checkTrait) {
        if (checkTrait.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        print(new Animal("Frog", true, false), Animal::canHop);
        print(new Animal("Rabbit", true, false), a -> a.canHop());
    }
}
