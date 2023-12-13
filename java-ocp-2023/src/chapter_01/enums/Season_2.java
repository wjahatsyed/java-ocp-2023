package chapter_01.enums;

/**
 * Created by Syed Wajahat on 4/30/2020.
 */
public enum Season_2 {
    WINTER("Low"), SUMMER("High"), AUTUMN("Medium"), SPRING("Medium");

    String expectedVisitors;

    private Season_2(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitor() {
        System.out.println(expectedVisitors);
    }
}
