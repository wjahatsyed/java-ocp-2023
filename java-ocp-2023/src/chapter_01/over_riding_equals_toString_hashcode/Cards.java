package chapter_01.over_riding_equals_toString_hashcode;

/**
 * Created by Syed Wajahat on 12/4/2019.
 */
public class Cards {
    /*
    Proper example of overriding toString, hashCode and equals
     */

    String rank;
    String suit;

    public Cards(String rank, String suit) {
        if (rank == null || suit == null) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.rank;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cards)) {
            return false;
        }

        Cards card = (Cards) o;

        return rank.equals(card.rank) && suit.equals(card.suit);

    }

    @Override
    public int hashCode() {
        return this.rank.hashCode();
    }

}
