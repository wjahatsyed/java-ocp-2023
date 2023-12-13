package chapter_05.working_with_dates_and_times.working_with_instants;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class ZonedDateTime_Into_Instant {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 3, 26);
        LocalTime time = LocalTime.of(6, 30);
        ZoneId zoneId = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zoneId);
        System.out.println(zonedDateTime);
        Instant instant = zonedDateTime.toInstant();
        System.out.println(instant);

        //Math withs instant - HOURS, DAYS  available from ChronoUnit
        Instant nextHours = instant.plus(1, ChronoUnit.HOURS);
        System.out.println(nextHours);
        Instant nextDay = instant.plus(2, ChronoUnit.DAYS);
        System.out.println(nextDay);
        Instant nextWeek = instant.plus(3,ChronoUnit.WEEKS);
        System.out.println(nextWeek);
    }
}
