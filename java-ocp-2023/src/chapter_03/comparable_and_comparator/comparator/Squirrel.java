package chapter_03.comparable_and_comparator.comparator;

import java.util.Comparator;

/**
 * Created by Syed Wajahat on 12/16/2019.
 * Do it by Comparable and Comparator both or use only Comparator
 * First sort on name then on weight
 */
public class Squirrel implements Comparator<Squirrel> {
    private String name;
    private int weight;

    public Squirrel(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compare(Squirrel s1, Squirrel s2) {
        //first sort on name
        int result = s1.getName().compareTo(s2.getName());
        if (result != 0) return result;
        //If name is same then sort on weight
        return s1.getWeight() - s2.getWeight();
    }


}
