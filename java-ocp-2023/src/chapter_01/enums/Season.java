package chapter_01.enums;

/**
 * Created by Syed Wajahat on 12/5/2019.
 */
public enum Season {
    WINTER, SUMMER, SPRING, AUTUMN
    /*
    An enum cannot be extended.
    The constructor in an enum is private.
    The code will not compile with a public constructor
    We can add fields, constructors & methods in a enum
    We can add abstract methods in enum which have to be implemented by each
    and every constant value of enum
    We can also have common methods and override those methods
     */
}
