import java.util.Scanner;
import java.util.*;

public class Main {

    public static String[] words;
    public static Hand hand;

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println(
                "Please provide a hand of cards: \n" +
                        "For example, given a string input of:\n" +
                        "'AS, 10C, 10H, 3D, 3S'\n" +
                        "(the cards above are ace of spades, 10 of clubs, 10 of hearts, 3 of diamonds and 3 of spades)"
        );

        String input = myScanner.nextLine();

        Main main = new Main();

        words = main.InputValidation(input);
        hand = main.createHand(words);
        hand.sortByRank();

        Dealer dealer = new Dealer();
        dealer.checkHand(hand);

    }

    public String[] InputValidation(String input){
        String[] words = input.split(",");

        //check if 5 cards in hand
        if(words.length != 5){
            System.out.println("Your hand has to have 5 cards");
            System.exit(0);
        }

        //check if correct number of characters
        for(int i=0; i<words.length; i++){
            if(words[i].trim().length() !=2 && words[i].trim().length() != 3){
                System.out.println("Please enter valid card combinations");
                System.exit(0);
            }
        }

        //check for duplicates
        Map<String, Integer> map = new HashMap<>();
        for(String word: words){
            if(map.containsKey(word.trim())){
                System.out.println("No duplicate cards allowed");
                System.exit(0);
            }else{
                map.put(word.trim(), 1);
            }
        }

        return words;
    }

    public Hand createHand(String[] words){
        Card[] cards = new Card[5];

        for (int i=0; i<cards.length; i++){
            if(words[i].trim().length() == 2){
                Card myCard = new Card(String.valueOf(words[i].trim().charAt(0)), words[i].trim().charAt(1));
                cards[i] = myCard;

            }else if(words[i].trim().length() == 3){
                Card myCard = new Card(words[i].trim().substring(0,2), words[i].trim().charAt(2));
                cards[i] = myCard;
            }

        }

        return hand = new Hand(cards);


    }
}
