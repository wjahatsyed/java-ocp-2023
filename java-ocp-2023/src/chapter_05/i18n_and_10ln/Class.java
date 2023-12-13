package chapter_05.i18n_and_10ln;

import java.util.Locale;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class Class {
    //i18n and l10n
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        //3 ways to create a locale
        Locale locale1 = new Locale("ur", "PAK");
        System.out.println(locale1);

        Locale locale2 = Locale.GERMAN;
        System.out.println(locale2);
        Locale locale3 = Locale.GERMANY;
        System.out.println(locale3);

        //Builder pattern
        Locale locale4 = new Locale.Builder().setLanguage("en").setRegion("US").build();
        System.out.println(locale4);

    }
}
