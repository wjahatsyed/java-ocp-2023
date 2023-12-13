package chapter_01.over_riding_equals_toString_hashcode;

/**
 * Created by Syed Wajahat on 12/2/2019.
 */
public class MyClass {
    String name;
    int ID;

    public MyClass(String name, int ID) {
        super();
        this.name = name;
        this.ID = ID;

    }

    @Override
    public String toString() {
        return name;
    }

    //equals work as == from the Object class implementation if not overridden
    //== means two references refer to the same object in memory

    @Override
    public boolean equals(Object o) {
        //first check if instance of this class
        if (!(o instanceof MyClass)) {
            return false;
        }

        //type cast O
        MyClass newObject = (MyClass) o;
        return this.ID == newObject.ID;
    }

    /*
    hashCode is a number that puts instances of an object into finite categories like example of decks of cards
     */
}
