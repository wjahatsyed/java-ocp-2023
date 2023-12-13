package chapter_05.working_with_dates_and_times.working_with_periods;


import java.time.Period;

/**
 * Created by Syed Wajahat on 12/23/2019.
 */
public class Print_Period {
    public static void main(String[] args) {
        Period period = Period.of(2, 6, 15);
        System.out.println(period);
    }
}
