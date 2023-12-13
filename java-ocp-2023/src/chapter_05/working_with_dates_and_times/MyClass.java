package chapter_05.working_with_dates_and_times;

import java.time.*;

/**
 * Created by Syed Wajahat on 12/22/2019.
 * Starting Chapter No.5
 */
public class MyClass {
    public static void main(String[] args) {
        //Use static methods
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        //Create LocalDate with of method
        LocalDate localDate = LocalDate.of(2019, Month.MARCH, 26);
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(2019, 3, 26);
        System.out.println(localDate);
        if(localDate == localDate1){
            System.out.println("True");
        }else if(localDate.equals(localDate1)){
            System.out.println("Now Equal");
        }


    }
}
