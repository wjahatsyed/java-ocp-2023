package chapter_03.comparable_and_comparator.comparator;

import java.util.Comparator;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class ChainingComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        Comparator<Employee> c = Comparator.comparing(e -> e.getName());
        c = c.thenComparing(e -> e.getAge());
        return c.compare(e1, e2);
    }
}
