package com.wajahat.ocp.chapter_1.chapter1.nested_classes.local_inner_class;

/**
 * Created by Syed Wajahat on 12/8/2019.
 */
public class OuterClass {
    int a = 4;

    public void innerMethod() {
        class InnerClass {
            int b = 5;

            public void multiply() {
                System.out.println(a * b);
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.multiply();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.innerMethod();
    }
}
