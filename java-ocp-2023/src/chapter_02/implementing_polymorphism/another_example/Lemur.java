package chapter_02.implementing_polymorphism.another_example;

/**
 * Created by Syed Wajahat on 12/10/2019.
 */
public class Lemur extends Primate implements HasTail {
    public int age = 10;

    @Override
    public boolean isTailStripped() {
        return false;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStripped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());

        //Reference decides what instance variables and methods can be accessed
        //Let's type cast

        Lemur lemur1 = (Lemur) primate;
        //Now we can access age of the object
        System.out.println(lemur1.age);

        //Unrelated classes cannot be casted
    }
}
