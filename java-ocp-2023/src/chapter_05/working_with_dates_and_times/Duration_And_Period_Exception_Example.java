package chapter_05.working_with_dates_and_times;

import java.time.*;
import java.time.temporal.*;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class Duration_And_Period_Exception_Example {
    public static void main(String[] args) {
        //Following will throw exception
        //Duration with LocalDate
        Duration duration = Duration.of(4, ChronoUnit.HOURS);
        LocalDate date = LocalDate.of(2019, 3, 20);
        try {
            date.plus(duration);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                //Period with LocalTime
                Period period = Period.ofDays(4);
                LocalTime localTime = LocalTime.of(6, 15);
                localTime.plus(period);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}
