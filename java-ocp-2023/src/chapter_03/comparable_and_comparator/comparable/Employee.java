package chapter_03.comparable_and_comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class Employee implements Comparable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        return this.name.compareTo(employee.name);
    }

    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Wajahat"));
        employeeList.add(new Employee("Noor"));
        Collections.sort(employeeList);
        System.out.println(employeeList);
    }
}
