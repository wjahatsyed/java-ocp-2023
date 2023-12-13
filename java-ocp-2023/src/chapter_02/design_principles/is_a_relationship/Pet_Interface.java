package chapter_02.design_principles.is_a_relationship;

/**
 * Created by Syed Wajahat on 12/11/2019.
 * This is an example of is-a relationship.
 * Using abstract class and interface
 */
public interface Pet_Interface {
    public abstract void cuddle();
}

abstract class Animal {

}

class Feline extends Animal {
}

class Dog extends Animal implements Pet_Interface {
    @Override
    public void cuddle() {

    }
}

class Cat_ extends Feline implements Pet_Interface {
    @Override
    public void cuddle() {

    }
}

class Tiger extends Feline {

}


