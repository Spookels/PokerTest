import java.util.Arrays;
import java.util.stream.Collectors;

public class Dealer {
    public boolean royalFLush = false;
    public boolean straightFlush = false;
    public boolean fourOfAKind = false;
    public boolean flush = false;
    public boolean straight = false;
    public boolean threeOfAKind = false;
    public int pairCount;
    public String display = "";

    public String checkHand(Hand hand){
        Arrays.stream(hand.getCards())
                .collect(Collectors.groupingBy(s -> s.getRank()))
                .forEach((k, v) -> {

                    switch (v.size()){
                        case 2:
                            pairCount++;
                            break;
                        case 3:
                            threeOfAKind = true;
                            break;
                        case 4:
                            fourOfAKind = true;
                            break;
                    }
                });

        Arrays.stream(hand.getCards())
                .collect(Collectors.groupingBy(s -> s.getCardSuit()))
                .forEach((k, v) -> {
                            if(v.size() == 5){
                                flush = true;
                            }
                        }
                );

        isStraight(hand);
        Display();

        return "";
    }

    public String isStraight(Hand hand){

        if(hand.getCards()[4].getRank().numericValue == 1){

            if(hand.getCards()[3].getRank().numericValue == 10 && pairCount != 1) {
                if(flush){

                    royalFLush = true;
                    flush = false;
                }else {
                    straight = true;
                }
            }
        }
        if((hand.getCards()[0].getRank().numericValue - hand.getCards()[4].getRank().numericValue) == 4){
            if(flush){
                straightFlush = true;
                flush = false;
            }else {
                straight = true;
            }
        }
        return "";
    }

    public String Display(){
        if(royalFLush){
            display = "Royal Flush";
        }
        else if(straightFlush){
            display = "Straight Flush";
        }
        else if(fourOfAKind){
            display = "Four of a kind";
        }
        else if(threeOfAKind && pairCount == 1){
            display = "Full House";
        }
        else if(flush){
            display = "Flush";
        }
        else if(straight) {
            display = "Straight";
        }
        else if(threeOfAKind){
            display = "Three of a kind";
        }
        else if(pairCount == 2){
            display = "Two Pair";
        }
        else if(pairCount == 1){
            display = "One Pair";
        }
        else{
            display = "High Card";
        }

        System.out.println(display);
        return display;
    }
}
