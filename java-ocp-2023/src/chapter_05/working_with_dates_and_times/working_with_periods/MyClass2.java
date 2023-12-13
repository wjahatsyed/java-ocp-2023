package chapter_05.working_with_dates_and_times.working_with_periods;


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class MyClass2 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2019, Month.JANUARY, 01);
        LocalDate endDate = LocalDate.of(2019, Month.MARCH, 30);
        Period period = Period.ofMonths(1);
        AnimalEnrichment(startDate, endDate, period);

    }

    private static void AnimalEnrichment(LocalDate startDate, LocalDate endDate, Period period) {
        LocalDate upTo = startDate;
        while (upTo.isBefore(endDate)) {
            System.out.println("Give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
