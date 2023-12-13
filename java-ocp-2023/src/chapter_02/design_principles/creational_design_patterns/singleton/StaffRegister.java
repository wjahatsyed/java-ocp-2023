package chapter_02.design_principles.creational_design_patterns.singleton;

/**
 * Created by Syed Wajahat on 12/12/2019.
 */
public class StaffRegister {
    private static final StaffRegister instance;

    private StaffRegister() {

    }

    static {
        instance = new StaffRegister();
        //This gives us the ability to add more things after the class is loaded
        //static so loaded in the stack
    }

    public static StaffRegister getInstance() {
        return instance;
    }
}
