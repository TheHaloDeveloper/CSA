import java.util.Scanner;

public class BlackjackGame {
    private Deck deck;
    private Card[] playerHand;
    private Card[] dealerHand;
    private int playerHandSize;
    private int dealerHandSize;
    private Scanner scanner;

    public BlackjackGame() {
        deck = new Deck();
        playerHand = new Card[10];
        dealerHand = new Card[10];
        scanner = new Scanner(System.in);
    }

    private int calculateHandValue(Card[] hand, int size) {
        int total = 0, aces = 0;
        for (int i = 0; i < size; i++) {
            total += hand[i].getValue();
            if (hand[i].getValue() == 11) aces++;
        }
        while (total > 21 && aces > 0) {
            total -= 10;
            aces--;
        }
        return total;
    }

    private void displayHands(boolean showDealer) {
        System.out.print("Your hand: ");
        for (int i = 0; i < playerHandSize; i++) System.out.print(playerHand[i] + " ");
        System.out.println("(Total: " + calculateHandValue(playerHand, playerHandSize) + ")");

        System.out.print("Dealer's hand: ");
        if (showDealer) {
            for (int i = 0; i < dealerHandSize; i++) System.out.print(dealerHand[i] + " ");
            System.out.println("(Total: " + calculateHandValue(dealerHand, dealerHandSize) + ")");
        } else {
            System.out.println(dealerHand[0] + " [Hidden]");
        }
    }

    public void play() {
        while (true) {
            deck.shuffle();
            playerHandSize = dealerHandSize = 0;

            playerHand[playerHandSize++] = deck.dealCard();
            dealerHand[dealerHandSize++] = deck.dealCard();
            playerHand[playerHandSize++] = deck.dealCard();
            dealerHand[dealerHandSize++] = deck.dealCard();

            while (true) {
                displayHands(false);
                System.out.print("Hit or Stand? (h/s): ");
                String choice = scanner.next().toLowerCase();
                if (choice.equals("h")) {
                    playerHand[playerHandSize++] = deck.dealCard();
                    if (calculateHandValue(playerHand, playerHandSize) > 21) {
                        System.out.println("You busted! Dealer wins.");
                        return;
                    }
                } else if (choice.equals("s")) {
                    break;
                }
            }

            while (calculateHandValue(dealerHand, dealerHandSize) < 17) {
                dealerHand[dealerHandSize++] = deck.dealCard();
            }

            displayHands(true);
            int playerTotal = calculateHandValue(playerHand, playerHandSize);
            int dealerTotal = calculateHandValue(dealerHand, dealerHandSize);

            if (dealerTotal > 21 || playerTotal > dealerTotal) {
                System.out.println("You win!");
            } else if (playerTotal < dealerTotal) {
                System.out.println("Dealer wins.");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.print("Play again? (y/n): ");
            if (!scanner.next().toLowerCase().equals("y")) break;
        }
    }
}