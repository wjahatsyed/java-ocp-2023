package com.wajahat.ocp.chapter_1.chapter1.nested_classes.static_nested_class;

/**
 * Created by Syed Wajahat on 12/9/2019.
 */
public class Outer_Class_1 {
    private static class MyStaticClass {
        String name = "Wajahat";
    }

    public static void main(String[] args) {
        MyStaticClass staticClass = new MyStaticClass();
        System.out.println(staticClass.name);
    }
}
