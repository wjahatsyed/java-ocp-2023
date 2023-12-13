package chapter_01.nested_classes.local_inner_class;

/**
 * Created by Syed Wajahat on 3/3/2020.
 */
public class Outer {
    int a = 5;

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.myMethod();
    }

    public void myMethod() {
        int b = 25;
        class MyLocalInnerClass {
            public void multiply() {
                System.out.println(a * b);
            }
        }
        MyLocalInnerClass myLocalInnerClass = new MyLocalInnerClass();
        myLocalInnerClass.multiply();
    }
}
