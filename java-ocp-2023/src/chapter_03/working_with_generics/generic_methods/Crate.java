package chapter_03.working_with_generics.generic_methods;

/**
 * Created by Syed Wajahat on 12/15/2019.
 */
public class Crate {
    public static <T> T identity(T t) {
        return t;
    }
}
