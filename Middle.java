public class Middle {
    String str;

    public Middle(String main) {
        str = main;
    }

    public char middle_char() {
        return (char) str.charAt(str.length() / 2);
    }
}
