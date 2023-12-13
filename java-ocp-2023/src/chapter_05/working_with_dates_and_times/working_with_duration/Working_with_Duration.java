package chapter_05.working_with_dates_and_times.working_with_duration;

import java.time.Duration;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class Working_with_Duration {
    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1);
        Duration hourly = Duration.ofHours(1);
        Duration minutes = Duration.ofMinutes(1);
        Duration seconds = Duration.ofSeconds(1);
        Duration milli = Duration.ofMillis(1);
        Duration nano = Duration.ofNanos(1);
    }
}
