package chapter_03.method_references;

import java.util.Comparator;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class Duck {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        //let's use the DuckHelper by Lambda first and then by Method reference
        Comparator<Duck> duckComparator = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);

        Comparator<Duck> duckComparator1 = DuckHelper::compareByWeight;
    }
}
