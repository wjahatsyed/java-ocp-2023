package chapter_05.i18n_and_10ln.using_a_resource_bundle;

import java.util.Locale;
import java.util.ResourceBundle;
/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class ZooOpen {
    public static void main(String[] args) {
        Locale en = new Locale("en");
        Locale fr = new Locale("fr", "FR");
        printProperties(en);
        System.out.println();
        printProperties(fr);


    }

    private static void printProperties(Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("open"));
    }
}
