package chapter_05.working_with_dates_and_times.working_with_duration;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class Working_with_Duration_2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        System.out.println(time);
        LocalDateTime localDateTime = LocalDateTime.of(2015, 6, 20, 6, 15, 20, 300);
        Duration duration = Duration.of(4, ChronoUnit.HOURS);
        //Add with time
        time= time.plus(duration);
        System.out.println(time);
        //Add with LocalDateTime
        localDateTime = localDateTime.plus(duration);
        System.out.println(localDateTime);
        //Following throws exception
        date = date.plus(duration);
        System.out.println(date);



    }
}
