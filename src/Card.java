public class Card {
    public enum Suit{
        Spades, Hearts, Clubs, Diamonds
    }

    public enum Rank{
        Ace(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack (11), Queen(12), King(13);

        public int numericValue;

        Rank(int value){
            this.numericValue = value;
        }
    }

    private Suit cardSuit;

    private Rank cardRank;

    Card(String inputRank, char inputSuit) {

    }

    public Suit getCardSuit(){
        return cardSuit;
    }

    public void setCardSuit(Suit suit){
        this.cardSuit = suit;
    }

    public Rank getRank() {
        return cardRank;
    }

    public void setRank(Rank rank){
        this.cardRank = rank;
    }


}
