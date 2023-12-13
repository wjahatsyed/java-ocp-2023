package chapter_03.comparable_and_comparator.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight){
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

    @Override
    public int compareTo(Duck duck) {
        return this.name.compareTo(duck.name);
    }

    public static void main(String[] args) {
        Comparator<Duck> comparator = new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                return o1.getWeight() - o2.getWeight();
            }
        };

        List<Duck> duckList = new ArrayList<>();
        duckList.add(new Duck("Quack", 7));
        duckList.add(new Duck("Puddles", 10));
        Collections.sort(duckList);
        System.out.println(duckList);
        Collections.sort(duckList, comparator);
        System.out.println(duckList);
    }
}
