import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem01 {

    private static DigitLetters digitLetters(String str) {
        Pattern digitsPattern = Pattern.compile("\\d");
        Matcher digitsMatcher = digitsPattern.matcher(str);
        int digitsCount = 0;
        while (digitsMatcher.find()) {
            digitsCount++;
        }

        Pattern lettersPattern = Pattern.compile("[a-z]");
        Matcher lettersMatcher = lettersPattern.matcher(str);
        int lettersCount = 0;
        while (lettersMatcher.find()) {
            lettersCount++;
        }

        return new DigitLetters(digitsCount, lettersCount);
    }

    static class DigitLetters {
        int digits;
        int letters;

        DigitLetters(int digits, int letters) {
            this.digits = digits;
            this.letters = letters;
        }
    }

    public static void main(String[] args) {
        String input = args[0];
        DigitLetters dl = digitLetters(input);
        System.out.println("Digits: " + dl.digits + ", Letters: " + dl.letters);
    }
}
