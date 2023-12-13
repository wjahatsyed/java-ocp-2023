package com.wajahat.ocp.review_questions;

/**
 * Created by Syed Wajahat on 1/6/2020.
 */
public class One {
    private int x = 24;

    public int getX() {
        String message = "x is ";
        class Inner {
            private int x = One.this.x;

            public void printX() {
                System.out.println(message + x);
            }
        }
        Inner in = new Inner();
        in.printX();
        return x;
    }

    public static void main(String[] args) {
        new One().getX();
    }

}
