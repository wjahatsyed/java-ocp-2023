package chapter_02.design_interface;

/**
 * Created by Syed Wajahat on 12/10/2019.
 */
public class My_New_Class implements MyInterface {
    @Override
    public void myDefaultMethod() {
        System.out.println("Default method overridden in class");
    }

    @Override
    public void myAbstractMethod() throws RuntimeException {

    }

    public static void main(String[] args) {
        MyInterface myObject = new My_New_Class();
        myObject.myDefaultMethod();
    }
}
