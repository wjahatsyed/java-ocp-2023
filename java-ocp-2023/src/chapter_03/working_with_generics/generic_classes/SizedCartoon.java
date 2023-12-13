package chapter_03.working_with_generics.generic_classes;

/**
 * Created by Syed Wajahat on 12/14/2019.
 */
public class SizedCartoon<T, U> {
    private T contents;
    private U sizeLimit;

    public SizedCartoon(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }
}
