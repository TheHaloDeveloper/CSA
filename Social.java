public class Social {
    private String ssn;

    public Social(String ssn) {
        this.ssn = ssn;
    }

    public String validate() {
        if (ssn.length() != 11) return "bad";
        if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') return "bad";
        for (int i = 0; i < ssn.length(); i++) {
            if (i == 3 || i == 6) continue;
            if (!Character.isDigit(ssn.charAt(i))) return "bad";
        }
        return ssn.substring(7);
    }
}