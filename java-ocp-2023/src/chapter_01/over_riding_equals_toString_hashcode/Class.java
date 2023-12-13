package chapter_01.over_riding_equals_toString_hashcode;

/**
 * Created by Syed Wajahat on 12/2/2019.
 */
public class Class {
    /*
    equals and hashCode are related
    When we override the equals(Object o) method, we are expected to override
    the hashCode method as well. The instance variables used in hashCode must be the same
    as used in the equals method or at least the subset of instance variables used in equals() method
     */

    public static void main(String[] args) {
        MyClass myClass = new MyClass("Ahmer", 5);
        MyClass myClass1 = new MyClass("Ahmer", 5);
        System.out.println(myClass);
        //This will give false if equals not implemented in MyClass
        System.out.println(myClass.equals(myClass1));


        //Contract for equals(Object o) method
        /*
        1. reflexive 2. Symmetric 3. Transitive 4. Consistent 5. Not null
         */
    }
}
