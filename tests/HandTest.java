import org.junit.Test;

import static org.junit.Assert.*;

public class HandTest {

    private Card card1 = new Card("A", 'S');
    private Card card2 = new Card("J", 'C');
    private Card card3 = new Card("10", 'S');
    private Card card4 = new Card("3", 'H');
    private Card card5 = new Card("3", 'D');

    private Card card6 = new Card("A", 'C');
    private Card card7 = new Card("Q", 'H');
    private Card card8 = new Card("A", 'S');
    private Card card9 = new Card("4", 'H');
    private Card card10 = new Card("4", 'D');

    private Card[] setCards = new Card[]{card6, card7, card8, card9, card10};

    private Card[] cards = new Card[]{card1, card2, card3, card4, card5};

    private Hand hand = new Hand(cards);

    @Test
    public void getCards() {
        assertEquals(cards, hand.getCards());
    }

    @Test
    public void setCards() {
        hand.setCards(setCards);
        assertEquals(setCards, hand.getCards());
    }

    @Test
    public void sortByRank() {
        hand.sortByRank();

        assertEquals(card2, hand.getCards()[0]);
    }
}