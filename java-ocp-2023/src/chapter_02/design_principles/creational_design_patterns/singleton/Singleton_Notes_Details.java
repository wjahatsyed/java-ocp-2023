package chapter_02.design_principles.creational_design_patterns.singleton;

/**
 * Created by Syed Wajahat on 12/12/2019.
 */
public class Singleton_Notes_Details {
    /*
    How singleton works:
    We make the constructors private
    We create a constant which calls the constructor to create the singleton instance

    The constant is returned through a public constant method
    By marking the constructor private, we are making the class implicitly final - i.e. it cannot be subclassed

    Every class which is sub class of a parent class has super() as first line in the constructor to call the constructor of the
    parent which in this case would not be possible because the constructor of the parent class - i.e. our class will be
    private - This is called effectively final

    Application configuration data and reusable caches are commonly implemented using Singletons


    1. HayStorage class is basic implementation of Singleton design pattern
    2. StaffRegister - using static block initialization
    conceptually 1 and 2 are the same
    3. Third implementation is the lazy instantiation - VisitorTicketTracker class
    4. VisitorTicketTracker_1 - this is thread safe
    Note: Synchronization is expensive as far as memory is concerned
    5. Apply double checked locking - for Synchronization cheap issue


     */
}
