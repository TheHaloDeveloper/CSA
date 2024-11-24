import static java.lang.System.*;

public class StringStuff {
    private String word;
    
    public StringStuff(String word) {
        this.word = word;
    }

    public void setString(String word) {
        this.word = word;
    }

    public boolean isEvenLength() {
        return word.length() % 2 == 0;
    }

    public boolean endsWith(String b) {
        return word.endsWith(b);
    }

    public boolean sameFirstLastLetters() {
        if (word.length() < 2) {
            return false;
        }
        return word.charAt(0) == word.charAt(word.length() - 1);
    }

    @Override
    public String toString() {
        return word;
    }
}