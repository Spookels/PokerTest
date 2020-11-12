public class Hand {

    Card[] cards;

    Hand(Card[] cards){
        this.cards = cards;
    }

    public Card[] getCards(){
        return this.cards;
    }

    public void setCards(Card[] cards){
        this.cards = cards;
    }
}
