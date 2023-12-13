package chapter_01.nested_classes.anonymous_inner_classes;

/**
 * Created by Syed Wajahat on 3/3/2020.
 * Example of Anonymous Inner Class
 */
public class Outer_2 {
    public static void main(String[] args) {
        Outer_2 outer_2 = new Outer_2();
        System.out.println(outer_2.pay(65));
    }

    abstract class MyAbstractClass {
        public abstract int dollarOff();
    }

    public int pay(int basePrice) {
        MyAbstractClass myAbstractClass = new MyAbstractClass() {
            @Override
            public int dollarOff() {
                return 5;
            }
        };
        return basePrice - myAbstractClass.dollarOff();
    }
}
