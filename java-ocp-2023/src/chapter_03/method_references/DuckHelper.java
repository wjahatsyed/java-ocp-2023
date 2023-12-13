package chapter_03.method_references;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class DuckHelper {
    public static int compareByWeight(Duck duck1, Duck duck2) {
        return duck1.getWeight() - duck2.getWeight();
    }

    public static int compareByName(Duck duck1, Duck duck2) {
        return duck1.getName().compareTo(duck2.getName());
    }
}
