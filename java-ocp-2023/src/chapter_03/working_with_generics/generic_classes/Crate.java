package chapter_03.working_with_generics.generic_classes;

/**
 * Created by Syed Wajahat on 12/14/2019.
 */
public class Crate<T> {
    private T contents;

    public T emptyCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
    }
}
