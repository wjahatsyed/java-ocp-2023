package com.wajahat.ocp.chapter_1.chapter1.nested_classes.member_inner_classes;

/**
 * Created by Syed Wajahat on 3/3/2020.
 */
public class MyOuter {
    public static void main(String[] args) {
        MyOuter myOuter = new MyOuter();
        MyInnerClass myInnerClass = myOuter.new MyInnerClass();
        myInnerClass.myInnerClassMethod();
    }

    private class MyInnerClass {
        public void myInnerClassMethod() {
            System.out.println("Hello");
        }
    }
}
