package chapter_01.overloading_and_overriding;

import chapter_01.access_modifiers.package_A.ParentClass;

/**
 * Created by Syed Wajahat on 12/1/2019.
 */
public class ChildClass extends ParentClass {
    @Override
    public int myMethod() throws RuntimeException{
        //This method must throw Exception or a sub class of exception such as RunTimeException in this case
        return -10;

    }
}
