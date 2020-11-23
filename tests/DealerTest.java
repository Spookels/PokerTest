import org.junit.Test;

import static org.junit.Assert.*;

public class DealerTest {

    private Dealer dealer = new Dealer();

    private Card card1 = new Card("A", 'S');
    private Card card2 = new Card("J", 'C');
    private Card card3 = new Card("10", 'S');
    private Card card4 = new Card("3", 'H');
    private Card card5 = new Card("3", 'D');

    private Card[] cards = new Card[]{card1, card2, card3, card4, card5};
    private Hand hand = new Hand(cards);

    @Test
    public void checkHand() {
        dealer.checkHand(hand);

        assertNotNull(hand);
        assertTrue(dealer.pairCount == 1);
        assertFalse(dealer.pairCount > 2);
    }

    @Test
    public void isStraight() {
        dealer.checkHand(hand);

        assertNotNull(hand);
        assertFalse(dealer.straight);
        assertTrue(dealer.pairCount == 1);

    }

    @Test
    public void display() {
        dealer.checkHand(hand);
        dealer.Display();

        assertNotNull(dealer.display);
        assertTrue(dealer.display == "One Pair");
        assertFalse(dealer.straightFlush);
    }
}