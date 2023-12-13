package chapter_02.design_principles.creational_design_patterns.singleton;

/**
 * Created by Syed Wajahat on 12/12/2019.
 */
public class MonkeyTrainer {
    public boolean feedMonkey(int numberOfMonkeys) {
        int hayRequired = 5 * numberOfMonkeys;
        HayStorage hayStorage = HayStorage.getInstance();
        if (hayStorage.getQuantity() < hayRequired) {
            hayStorage.addHay(hayRequired + 10);
        }
        boolean isFed = hayStorage.removeHay(hayRequired);
        return isFed;
    }
}
