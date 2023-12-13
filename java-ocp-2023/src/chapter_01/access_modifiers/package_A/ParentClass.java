package chapter_01.access_modifiers.package_A;

/**
 * Created by Syed Wajahat on 11/30/2019.
 */
public class ParentClass {
    /*
    Example of public, private, protected and default (package private)
    4 instance variable with these access modifiers
     */

    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id;

    public int myMethod() throws Exception {
        return 0;
    }

}
