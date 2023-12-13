package chapter_03.working_with_generics.generic_interface;


import chapter_03.working_with_generics.generic_classes.Robot;

/**
 * Created by Syed Wajahat on 12/14/2019.
 */
public class ShippableRobotCrate implements Shippable<Robot> {
    @Override
    public void ship(Robot robot) {

    }
}
