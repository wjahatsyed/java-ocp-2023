package chapter_02.implementing_polymorphism;

/**
 * Created by Syed Wajahat on 12/10/2019.
 */
public class Whale implements LivesInOcean {
    @Override
    public void makeSound() {
        System.out.println("I am a whale.");
    }
}
