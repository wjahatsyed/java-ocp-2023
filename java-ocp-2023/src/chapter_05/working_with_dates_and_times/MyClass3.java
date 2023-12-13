package chapter_05.working_with_dates_and_times;

import java.time.LocalDate;

/**
 * Created by Syed Wajahat on 12/22/2019.
 */
public class MyClass3 {
    public static void main(String[] args) {
        //All four classes of java.time.* are immutable
        LocalDate localDate = LocalDate.of(2014, 01, 21);
        System.out.println(localDate);
        //Add days
        localDate = localDate.plusDays(2);
        System.out.println(localDate);
        //Add weeks
        localDate = localDate.plusWeeks(2);
        System.out.println(localDate);
        //Add months
        localDate = localDate.plusMonths(4);
        System.out.println(localDate);
        //Add years
        localDate = localDate.plusYears(5);
        System.out.println(localDate);

    }
}
