package chapter_05.working_with_dates_and_times;

import java.time.*;

/**
 * Created by Syed Wajahat on 12/22/2019.
 */
public class MyClass2 {
    public static void main(String[] args) {
        //Create time with of method
        LocalTime localTime = LocalTime.of(6, 15);
        LocalTime localTime1 = LocalTime.of(6, 15, 30);
        LocalTime localTime2 = LocalTime.of(6, 14, 30, 200);

        LocalDateTime localDateTime = LocalDateTime.of(2019, 03, 26, 06, 15, 30, 200);
        //another method overloading
        LocalDate localDate = LocalDate.of(2018, Month.MARCH, 26);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);

        //Zone Id
        ZoneId zoneId = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(
                2019, 03, 26, 06, 15, 30, 200, zoneId);
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDate, localTime1, zoneId);
        System.out.println(zonedDateTime2);

        //get default zoneId
        ZoneId zoneId1 = ZoneId.systemDefault();
        System.out.println(zoneId1);

        //get with functional programming
        ZoneId.getAvailableZoneIds().stream()
                .filter(s -> s.contains("US") || s.contains("America")).sorted()
                .forEach(System.out::println);

        //check the speed of stream
        ZoneId.getAvailableZoneIds().stream().forEach(System.out::print);

        //Date more than 31 throws



    }
}
