package chapter_03.working_with_generics.generic_interface;

/**
 * Created by Syed Wajahat on 12/14/2019.
 * There are three ways to implement a generic interface
 */
public interface Shippable<T> {
    public abstract void ship(T t);
}
