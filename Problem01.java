import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem01 {

    private static String digitLetters(String str) {
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
        return "{Digits:" + digitsCount + ", Letters:" + lettersCount +"}";
    }

    public static void main(String[] args) {
        String input = args[0];
        String output = digitLetters(input);
        System.out.println(output);
    }
}
