import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    // fields

    private List<Card> cards;
    private int i;
    private final Random random = new Random();

    // methods

    public Deck() {
        cards = new ArrayList<>();
        for (Suit s : Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                cards.add(new Card(i, s));
            }
        }
    }

    public void shuffle() {
//        Random random = new Random();
        for (int i = 0; i < cards.size(); i++) {
            //        Random random = new Random();
            int j = random.nextInt(cards.size()-i) + i;
            Card card1 = cards.get(i);
            Card card2 = cards.get(i);
            cards.set(i, card2);
            cards.set(j, card1);
        }
    }

    public Card deal() {
        return cards.remove(cards.size() - 1);
    }

    public List<Card> deal(int num) {
        List<Card> dealCards = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            dealCards.add(deal());
        }
        return dealCards;
    }
}
