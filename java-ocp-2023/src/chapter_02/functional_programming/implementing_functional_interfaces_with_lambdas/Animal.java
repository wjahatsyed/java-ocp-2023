package chapter_02.functional_programming.implementing_functional_interfaces_with_lambdas;

/**
 * Created by Syed Wajahat on 12/10/2019.
 */
public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        super();
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return species;
    }
}
