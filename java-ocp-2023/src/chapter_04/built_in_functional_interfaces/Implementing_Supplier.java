package chapter_04.built_in_functional_interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * Created by Syed Wajahat on 12/17/2019.
 */
public class Implementing_Supplier {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = () -> LocalDate.now();
        Supplier<LocalDate> s2 = LocalDate::now;

        LocalDate localDate1 = s1.get();
        LocalDate localDate2 = s2.get();

        System.out.println(localDate1);
        System.out.println(localDate2);

        //Use constructor in Supplier to get StringBuilder
        Supplier<StringBuilder> sb1 = () -> new StringBuilder();
        Supplier<StringBuilder> sb2 = StringBuilder::new;

        System.out.println(sb1.get());
        System.out.println(sb2.get());

        Supplier<ArrayList<String>> arrayListSupplier = ArrayList<String>::new;
        System.out.println(arrayListSupplier.get());

    }
}
