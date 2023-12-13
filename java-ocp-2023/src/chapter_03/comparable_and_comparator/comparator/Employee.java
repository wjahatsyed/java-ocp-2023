package chapter_03.comparable_and_comparator.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/16/2019.
 * Example of Chaining comparator
 */
public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name + age;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Wajahat", 31));
        employees.add(new Employee("Wajahat", 25));
        employees.add(new Employee("Waqar", 20));
        ChainingComparator chainingComparator = new ChainingComparator();
        System.out.println(employees);
        Collections.sort(employees, chainingComparator);
        System.out.println(employees);

    }
}

