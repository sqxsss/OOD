import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Player {
    // fields

    private int userId;

    private List<Card> handCards;

    // methods

    public Player(){

    }

    public Player(int userId){
        this.userId = userId;
        handCards = new ArrayList<>();
    }

    public void addCard(Card card){
        handCards.add(card);
    }

    public void addCards(List<Card> cards){
        for(Card c : cards){
            addCard(c);
        }
    }

    public Card removeCard(int i){
        if(handCards.size() == 0 || i > handCards.size()){
            return null;
        }
        return handCards.remove(i);
    }

}
