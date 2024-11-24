public class CharacterAnalyzer {
    private char theChar;

    public CharacterAnalyzer() {
        theChar = ' ';
    }

    public CharacterAnalyzer(char c) {
        theChar = c;
    }

    public void setChar(char c) {
        theChar = c;
    }

    public boolean isUpper() {
        return theChar >= 'A' && theChar <= 'Z';
    }

    public boolean isLower() {
        return theChar >= 'a' && theChar <= 'z';
    }

    public boolean isNumber() {
        return theChar >= '0' && theChar <= '9';
    }

    public int getASCII() {
        return (int) theChar;
    }

    public String toString() {
        if (isUpper()) {
            return theChar + " is an uppercase character. ASCII == " + getASCII();
        } else if (isLower()) {
            return theChar + " is a lowercase character. ASCII == " + getASCII();
        } else if (isNumber()) {
            return theChar + " is a number. ASCII == " + getASCII();
        } else {
            return "None";
        }
    }
}