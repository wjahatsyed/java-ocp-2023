package chapter_03.comparable_and_comparator.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class SortRabbits {
    static class Rabbit {
        int id;

        public Rabbit(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Set<Rabbit> rabbits = new TreeSet<>(
                new Comparator<Rabbit>() {
                    @Override
                    public int compare(Rabbit o1, Rabbit o2) {
                        return o1.id - o2.id;
                    }
                }
        );
        rabbits.add(new Rabbit(10));
    }

}
