package chapter_03.working_with_generics.generic_classes;

/**
 * Created by Syed Wajahat on 12/14/2019.
 */
public class Zebra {
    public static void main(String[] args) {
        Zebra zebra = new Zebra();
        Crate<Zebra> zebraCrate = new Crate<>();
        zebraCrate.packCrate(zebra);

        Zebra atDestination = zebraCrate.emptyCrate();
    }
}
