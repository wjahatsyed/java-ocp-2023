package chapter_02.functional_programming.implementing_functional_interfaces_with_lambdas;

/**
 * Created by Syed Wajahat on 12/10/2019.
 */
public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait) {
        if (trait.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        print(new Animal("Fish", false, true), a -> a.canHop());
        print(new Animal("Kangaroo", true, false), a -> a.canHop());
    }
}
