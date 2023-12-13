package chapter_01.access_modifiers.package_B;

import chapter_01.access_modifiers.package_A.ParentClass;

/**
 * Created by Syed Wajahat on 11/30/2019.
 */
public class ChildClass extends ParentClass {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();

        //public member is available
        System.out.println(parentClass.name);

        //protected member is not available
        //System.out.println(parentClass.hasFur);
        /*
        Protected members can only be available through inheritance
         */
        ChildClass childClass = new ChildClass();

        /*
        The protected member of parent class only be accessible through this
        manner. Object reference of child class and object of child class
         */
        System.out.println(childClass.hasFur);
    }
}
