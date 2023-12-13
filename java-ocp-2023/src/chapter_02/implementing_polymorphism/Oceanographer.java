package chapter_02.implementing_polymorphism;

/**
 * Created by Syed Wajahat on 12/10/2019.
 */
public class Oceanographer {
    public void checkSound(LivesInOcean fish){
        fish.makeSound();
    }

    public static void main(String[] args){
        Oceanographer oceanographer = new Oceanographer();
        oceanographer.checkSound(new Whale());
        oceanographer.checkSound(new Dolphin());
    }
}
