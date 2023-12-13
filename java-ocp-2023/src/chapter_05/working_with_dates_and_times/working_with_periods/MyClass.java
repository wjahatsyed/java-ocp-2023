package chapter_05.working_with_dates_and_times.working_with_periods;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Syed Wajahat on 12/22/2019.
 */
public class MyClass {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2019, Month.JANUARY, 01);
        LocalDate endDate = LocalDate.of(2019, Month.MARCH, 30);
        printAnimalEnrichmentPlan(startDate, endDate);
    }

    private static void printAnimalEnrichmentPlan(LocalDate startDate, LocalDate endDate) {
        LocalDate upTo = startDate;
        while (upTo.isBefore(endDate)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }

    }
}
