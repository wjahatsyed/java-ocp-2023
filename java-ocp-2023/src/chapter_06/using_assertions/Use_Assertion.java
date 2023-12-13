package chapter_06.using_assertions;

/**
 * Created by Syed Wajahat on 12/24/2019.
 * enable assertion without specifying any package by the following:
 * java -ea Use_Assertion
 */
public class Use_Assertion {
    public static void main(String[] args) {
        int numberOfGuests = -5;
        assert numberOfGuests > 0;
        System.out.println(numberOfGuests);
    }

}
