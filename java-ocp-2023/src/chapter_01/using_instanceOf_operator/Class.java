package chapter_01.using_instanceOf_operator;

/**
 * Created by Syed Wajahat on 12/1/2019.
 */
public class Class {
    /*
    a instanceOf B
    Returns true in the following cases:
    a refers to an object that is an instance of B
    a refers to an object of a class that is a subclass of B
    a refers to an object of such a class that implements the B interface

    Consider the following three classes
    class HeavyAnimal{}
    class Hippo extends HeavyAnimal{}
    class Elephant extends HeavyAnimal{}

    If a is a reference of an interface, it is checked at run time
     */

    public static void main(String[] args){
        //using instanceof operator
        Hippo hippo = new Hippo();
        if(hippo instanceof HeavyAnimal){
            System.out.println("hippo is a heavy animal");
        }

        //using instanceof operator with parent class reference
        HeavyAnimal heavyAnimal = new Hippo();
        //The following will compile because of interface reference because Elephant also extends HeavyAnimal
        if(heavyAnimal instanceof Elephant){
            System.out.println("heavyAnimal is an elephant");
        }

        //interface reference example
        Hippo hippo1 = new Hippo();
        boolean b = hippo1 instanceof MotherAnimal;
    }
}
