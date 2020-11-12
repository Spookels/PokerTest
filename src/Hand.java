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

    public Card[] sortByRank(){
        Card tempCard;
        for(int i = 0; i < this.cards.length; i++){
            for(int j = 0; j < this.cards.length; j++){
                if(this.cards[i].getRank().numericValue > this.cards[j].getRank().numericValue){
                    tempCard = cards[i];
                    cards[i] = cards[j];
                    cards[j] = tempCard;
                }
            }
        }
        return this.cards;
    }
}
