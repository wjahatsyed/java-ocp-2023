package chapter_03.working_with_generics.generic_classes;

/**
 * Created by Syed Wajahat on 12/14/2019.
 */
public class Elephant {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> elephantCrate = new Crate<>();
        Crate crate = new Crate();

        elephantCrate.packCrate(elephant);

        //Drop crate at new Zoo
        Elephant elephant1 = elephantCrate.emptyCrate();

    }
}
