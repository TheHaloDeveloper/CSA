public class AvgLen {
    String one;
    String two;

    public AvgLen(String one, String two) {
        this.one = one;
        this.two = two;
    }

    public double avg() {
        int totalLength = one.length() + two.length();
        return (double) totalLength / 2;
    }
}
