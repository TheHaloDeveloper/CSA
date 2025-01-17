public class CookieJar {
    private int capacity;
    private int cookies = 0;

    public CookieJar(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return cookies == capacity;
    }

    public int addStuff(int amount) {
        if (cookies + amount > capacity) {
            int difference = amount - (capacity - cookies);
            cookies = capacity;
            return difference;
        }
        cookies += amount;
        return cookies - capacity;
    }

    public int spaceLeft() {
        return capacity - cookies;
    }
}
