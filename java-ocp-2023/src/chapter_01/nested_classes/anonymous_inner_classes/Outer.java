package chapter_01.nested_classes.anonymous_inner_classes;

/**
 * Created by Syed Wajahat on 12/8/2019.
 */
public class Outer {
    abstract class SaleToday {
        abstract int dollarsOff();
    }

    public int pay(int basePrice) {
        SaleToday saleToday = new SaleToday() {
            @Override
            int dollarsOff() {
                return 25;
            }
        };

        return basePrice - saleToday.dollarsOff();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        int price = outer.pay(65);
        System.out.println(price);
    }

}
