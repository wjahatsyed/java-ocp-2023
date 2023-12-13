package com.wajahat.ocp.chapter_1.chapter1.nested_classes.member_inner_classes;

/**
 * Created by Syed Wajahat on 12/8/2019.
 */
public class Outer {
    String name = "Wajahat";

    public class Inner {
        public void printName() {
            for (int i = 0; i < 3; i++) {
                System.out.println(name);
            }
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.printName();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();
    }
}
