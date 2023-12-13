package chapter_01.overloading_and_overriding;

/**
 * Created by Syed Wajahat on 3/3/2020.
 */
public class OverloadingExample {
    public void myMethod1(int a) {
        System.out.println(a);
    }

    public int myMethod1(int a, int b) {
        return a + b;
    }
}
