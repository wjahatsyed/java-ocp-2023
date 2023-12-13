package chapter_03.working_with_generics.generic_interface;

/**
 * Created by Syed Wajahat on 12/15/2019.
 */
public class ShippableAbstractClass<U> implements Shippable<U> {
    @Override
    public void ship(U u) {

    }
}
