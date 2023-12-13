package chapter_02.implementing_polymorphism.class_cast_exception;

/**
 * Created by Syed Wajahat on 12/10/2019.
 */
public class ChildClass extends ParentClass {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        //The below line will throw ClassCastException
        //Why? Remember the instanceof operator rule
        //ChildClass childClass = (ChildClass)parentClass;

        //Solution is use instanceof operator
        if(parentClass instanceof ChildClass){
            ChildClass childClass = (ChildClass)parentClass;
        }else{
            System.out.println("Could not cast");
        }

        ChildClass childClass = (ChildClass)parentClass;

    }

}
