import java.util.Random;

public class Deck {
    private Card[] cards;
    private int top;

    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        cards = new Card[52];
        top = 0;
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                int value = rank.equals("Ace") ? 11 : rank.matches("[0-9]+") ? Integer.parseInt(rank) : 10;
                cards[index++] = new Card(suit, rank, value);
            }
        }

        shuffle();
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
        top = 0;
    }

    public Card dealCard() {
        return (top < cards.length) ? cards[top++] : null;
    }
}