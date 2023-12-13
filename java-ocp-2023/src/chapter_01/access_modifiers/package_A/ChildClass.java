package chapter_01.access_modifiers.package_A;

/**
 * Created by Syed Wajahat on 12/1/2019.
 */
public class ChildClass {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        //public member is available
        System.out.println(parentClass.name);

        //protected is also available because package is same
        System.out.println(parentClass.hasFur);

        //private is not available
        //System.out.println(parentClass.id);

        //default - package private is available
        System.out.println(parentClass.hasPaws);
    }
}
