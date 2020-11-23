import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    private Card card1 = new Card("A", 'S');
    private Card card2 = new Card("J", 'C');


    @Test
    public void getCardSuit() {

        assertEquals("Spades", card1.getCardSuit().toString());
    }

    @Test
    public void setCardSuit() {
        card1.setCardSuit(card2.getCardSuit());

        assertNotNull(card1);
        assertEquals("Clubs", card1.getCardSuit().toString());
    }

    @Test
    public void getRank() {
        assertEquals(1, card1.getRank().numericValue);
    }

    @Test
    public void setRank() {
        card1.setRank(card2.getRank());

        assertNotNull(card1);
        assertEquals(11, card1.getRank().numericValue);

    }
}