package chapter_03.working_with_generics.generic_classes;

/**
 * Created by Syed Wajahat on 12/14/2019.
 */
public class Robot {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Integer pounds = 15_000;
        SizeLimitCrate<Robot, Integer> robotSizeLimitCrate = new SizeLimitCrate<>(robot, pounds);
    }

}
