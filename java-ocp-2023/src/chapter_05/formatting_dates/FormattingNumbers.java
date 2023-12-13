package chapter_05.formatting_dates;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class FormattingNumbers {
    public static void main(String [] args){
        int attendees_per_year = 3_200_000;
        int attendees_per_month = attendees_per_year/12;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendees_per_month));
        NumberFormat gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendees_per_month));
        NumberFormat cn = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(cn.format(attendees_per_month));

        //Currency
        NumberFormat usd = NumberFormat.getCurrencyInstance(Locale.US);
        int dollars = 48;
        System.out.println(usd.format(dollars));

    }
}
