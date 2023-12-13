package chapter_01.enums;

/**
 * Created by Syed Wajahat on 4/30/2020.
 */
public enum Temperature {
    WINTER("LOW"), SUMMER("High"), Autumn("Medium"), Spring("Average");
    String temperature;

    //enum constructor is private by default.
    private Temperature(String temperature) {
        this.temperature = temperature;
    }
}
