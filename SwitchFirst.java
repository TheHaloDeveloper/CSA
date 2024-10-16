public class SwitchFirst {
    String one;
    String two;

    public SwitchFirst(String one, String two) {
        this.one = one;
        this.two = two;
    }

    public String new_str() {
        return two.charAt(0) + one.substring(1);
    }
}
