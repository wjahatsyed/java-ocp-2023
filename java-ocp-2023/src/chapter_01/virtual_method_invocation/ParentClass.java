package chapter_01.virtual_method_invocation;

/**
 * Created by Syed Wajahat on 12/2/2019.
 */
public class ParentClass {
    String name = "From Parent";

    public void callMe(){
        play();
    }

    public void play(){
        System.out.println("Hello");
    }
}

class ChildClass extends ParentClass {
    String name = "Wajahat";

    @Override
    public void play(){
        System.out.println("Bye");
    }

}
