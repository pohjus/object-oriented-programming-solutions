/**
 * @author Jussi Pohjolainen
 */
public class Main {
    public static void main(String [] args) {
        System.out.println(getPercentageRounds(0.3));
    }

    private static String getPercentageRounds(double percentage, int numberOfChars, String fillChar, String nonFillChar) {
        if(!(percentage >= 0.0 && percentage <= 1)) {
            throw new IllegalArgumentException("Percentage must be 0.0 - 1.0");
        }
        if(!(numberOfChars >= 2)) {
            throw new IllegalArgumentException("Number of chars must be >= 2.");
        }

        int numberOfFilledBalls = (int) (percentage * numberOfChars);
        int numberOfWhiteBalls = numberOfChars - numberOfFilledBalls;

        return fillChar.repeat(numberOfFilledBalls) + nonFillChar.repeat(numberOfWhiteBalls);
    }

    private static String getPercentageRounds(double percentage) {
        return getPercentageRounds(percentage, 10, "🔵", "⚪");
    }

}
