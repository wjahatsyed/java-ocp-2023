package chapter_02.design_interface;

/**
 * Created by Syed Wajahat on 12/10/2019.
 */
public interface MyInterface {
    //default method
    public default void myDefaultMethod() {
        System.out.println("Makko from interface");
    }

    void myAbstractMethod() throws Exception;

}
