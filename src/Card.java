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

        switch(inputSuit){
            case('C'):
            case('c'):
                this.cardSuit = Suit.Clubs;
                break;
            case('H'):
            case('h'):
                this.cardSuit = Suit.Hearts;
                break;
            case('S'):
            case('s'):
                this.cardSuit = Suit.Spades;
                break;
            case('D'):
            case('d'):
                this.cardSuit = Suit.Diamonds;
                break;
            default:
                System.out.println("Please enter valid card combinations");
                System.exit(0);
        }

        switch(inputRank.toUpperCase()){
            case("A"):
                this.cardRank = Rank.Ace; break;
            case("K"):
                this.cardRank = Rank.King; break;
            case("Q"):
                this.cardRank = Rank.Queen; break;
            case("J"):
                this.cardRank = Rank.Jack; break;
            case("10"):
                this.cardRank = Rank.Ten; break;
            case("9"):
                this.cardRank = Rank.Nine; break;
            case("8"):
                this.cardRank = Rank.Eight; break;
            case("7"):
                this.cardRank = Rank.Seven; break;
            case("6"):
                this.cardRank = Rank.Six; break;
            case("5"):
                this.cardRank = Rank.Five; break;
            case("4"):
                this.cardRank = Rank.Four; break;
            case("3"):
                this.cardRank = Rank.Three; break;
            case("2"):
                this.cardRank = Rank.Two; break;
            case("1"):
                this.cardRank = Rank.Ace; break;
            default:
                System.out.println("Please enter valid card combinations");
                System.exit(0);
        }

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
