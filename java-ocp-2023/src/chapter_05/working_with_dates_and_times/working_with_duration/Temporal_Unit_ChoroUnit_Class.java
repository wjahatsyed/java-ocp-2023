package chapter_05.working_with_dates_and_times.working_with_duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Created by Syed Wajahat on 12/23/2019.
 * TemporalUnit is an interface
 * ChronoUnit is the implementation
 */
public class Temporal_Unit_ChoroUnit_Class {
    public static void main(String[] args) {
        Duration days = Duration.of(2, ChronoUnit.DAYS);
        System.out.println(days);

        Duration hours = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(hours);

        Duration halfDays = Duration.of(1, ChronoUnit.HALF_DAYS);
        System.out.println(halfDays);

        Duration minutes = Duration.of(5, ChronoUnit.MINUTES);
        System.out.println(minutes);

        Duration seconds = Duration.of(10, ChronoUnit.SECONDS);
        System.out.println(seconds);

        Duration millis = Duration.of(5, ChronoUnit.MILLIS);
        System.out.println(millis);

        Duration nanos = Duration.of(25, ChronoUnit.NANOS);
        System.out.println(nanos);

    }

}
