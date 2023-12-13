package chapter_02.design_principles.has_a_relationship;


/**
 * Created by Syed Wajahat on 12/11/2019.
 */
public class Penguin {
    private Flippers flippers;
    private WebbedFeet webbedFeet;

    public Penguin(Flippers flippers, WebbedFeet webbedFeet) {
        this.flippers = flippers;
        this.webbedFeet = webbedFeet;
    }

    public static void main(String[] args) {
        Penguin penguin = new Penguin(new Flippers(), new WebbedFeet());
        penguin.flippers.flap();
        penguin.webbedFeet.kick();
    }
}

class Flippers {
    public void flap() {
        System.out.println("Flapper go back and forth");
    }
}

class WebbedFeet {
    public void kick() {
        System.out.println("Kicking kicks back and forth");
    }
}
