package chapter_01.virtual_method_invocation;

/**
 * Created by Syed Wajahat on 12/2/2019.
 */
public class Class {
    public static void main(String[] args){
        ParentClass child = new ChildClass();
        //The reference will decide from where the instance variables and methods will be called.
        System.out.println(child.name);

        //In case of methods, overriding will checked in sub classes
        //If method is overridden in child class, method from child class will be called

        child.callMe();

        /*
        @Override is a method used to help us override the methods properly
         */
    }
}
