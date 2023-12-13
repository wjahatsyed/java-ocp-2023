package chapter_05.working_with_dates_and_times.working_with_instants;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class Example {
    public static void main(String[] args) {
        Instant instantNow = Instant.now();
        System.out.println(instantNow);
        ZoneId.getAvailableZoneIds().stream().forEach(System.out::print);
        System.out.println();
        Instant instantLater = Instant.now();
        System.out.println(instantLater);
        Duration duration = Duration.between(instantNow, instantLater);
        System.out.println(duration);
    }
}
