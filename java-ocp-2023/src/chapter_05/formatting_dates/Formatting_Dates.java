package chapter_05.formatting_dates;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class Formatting_Dates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));

        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));

        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        LocalDate date1 = LocalDate.parse(
                "2018–04–30", DateTimeFormatter.ISO_LOCAL_DATE);
        date.plusDays(2);
        //date.plusHours(3);

        LocalDate date11 = LocalDate.of(2018, Month.APRIL, 40);

        Period p = Period.of(1, 2, 3);
        Instant instant = Instant.now();
        Instant instant1 = Instant.ofEpochSecond(0L);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        Instant instant2 = zonedDateTime.toInstant();


    }
}
