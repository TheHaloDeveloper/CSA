public class Card {
    private String rank;
    private int value;

    public Card(String rank, int value) {
        this.rank = rank;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return rank;
    }
}