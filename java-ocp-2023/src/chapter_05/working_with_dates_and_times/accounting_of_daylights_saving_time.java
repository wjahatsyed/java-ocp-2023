package chapter_05.working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class accounting_of_daylights_saving_time {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2016, 3, 13);
        LocalTime localTime = LocalTime.of(1, 30);
        ZoneId zoneId = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zoneId);
        System.out.println(zonedDateTime);
        zonedDateTime = zonedDateTime.plus(1, ChronoUnit.HOURS);
        System.out.println(zonedDateTime);
    }
}
