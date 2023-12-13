package chapter_01.enums;

/**
 * Created by Syed Wajahat on 4/30/2020.
 */
public class Example_1 {
    public static void main(String[] args) {
        Season s = Season.AUTUMN;
        System.out.println(s);
        if (s == Season.AUTUMN) {
            System.out.println("True");
        }

        //looping on enums
        for (Season season : Season.values()) {
            System.out.println(season.name() + "-" + season.ordinal());
        }
    }
}
