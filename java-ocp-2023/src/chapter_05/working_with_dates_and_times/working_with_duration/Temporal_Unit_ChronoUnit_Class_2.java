package chapter_05.working_with_dates_and_times.working_with_duration;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class Temporal_Unit_ChronoUnit_Class_2 {
    public static void main(String[] args) {
        //Get difference between times
        LocalTime time1 = LocalTime.of(5, 15);
        LocalTime time2 = LocalTime.of(6, 30);

        System.out.println(ChronoUnit.HOURS.between(time1, time2));
        System.out.println(ChronoUnit.MINUTES.between(time1, time2));

        //Exception case
        try {
            LocalDate localDate = LocalDate.of(2015, 06, 01);
            System.out.println(ChronoUnit.HOURS.between(time1, localDate));
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
}
