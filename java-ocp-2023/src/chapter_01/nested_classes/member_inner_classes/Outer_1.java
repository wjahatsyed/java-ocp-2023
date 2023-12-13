package com.wajahat.ocp.chapter_1.chapter1.nested_classes.member_inner_classes;

/**
 * Created by Syed Wajahat on 12/8/2019.
 */
public class Outer_1 {
    String name = "Syed Muhammad Wajahat";

    protected class InnerClass {
        public void printName() {
            for (int i = 0; i < 3; i++) {
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        Outer_1 outer_1 = new Outer_1();
        InnerClass innerClass = outer_1.new InnerClass();
        innerClass.printName();
    }

}
