package chapter_05.formatting_dates;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class FormattingNumbers_2 {
    public static void main(String[] args) throws ParseException {
        NumberFormat nf = NumberFormat.getInstance();
        String one = "456abc";
        String two = "-2.5165x10";
        String three = "x85.3";
        //prints 456
        System.out.println(nf.parse(one));
        //prints -2.5165
        System.out.println(nf.parse(two));
        //Throws exception
        System.out.println(nf.parse(three));
        int abca =(Integer) nf.parse(one);

    }
}
