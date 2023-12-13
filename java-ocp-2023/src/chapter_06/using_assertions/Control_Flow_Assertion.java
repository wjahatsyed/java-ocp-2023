package chapter_06.using_assertions;

/**
 * Created by Syed Wajahat on 12/24/2019.
 */
public class Control_Flow_Assertion {
    public static void main(String[] args) {
        test(Season.WINTER);

    }

    public static void test(Season season) {
        switch (season) {
            case SPRING:
            case FALL:
                System.out.println("Less Public");
                break;
            case SUMMER:
                System.out.println("A lot of people");
                break;
            default:
                assert false : "Invalid Season";
        }
    }
}
