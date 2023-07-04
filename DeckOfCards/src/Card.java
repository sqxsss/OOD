public class Card {
    // fields

    private final int value;

    private final Suit suit;

    // methods

    public Card(int value, Suit suit){
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }
}
