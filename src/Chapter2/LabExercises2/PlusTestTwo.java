package Chapter2.LabExercises2;

public class PlusTestTwo {
    public static void main(String[] args) {
        System.out.println ("This is a long string that is the " +
                "concatenation of two shorter strings.");

        System.out.println ("The first computer was invented about" + 55 +
                "years ago.");

        System.out.println ("8 plus 5 is " + 8 + 5);

        System.out.println ("8 plus 5 is " + (8 + 5));

        System.out.println (8 + 5 + " equals 8 plus 5.");
    }

    /*
    Last 3 Lines:
    8 plus 5 is 85
    8 plus 5 is 13
    13 equals 8 plus 5.

    Line 1: When numbers are not placed within parentheses and are at the same level as the concatenation of strings, the digits are counted as strings.
    Line 2: When numbers are placed with parentheses, in a separate level of calculation inside the concatenation of strings, the operation is done and then
    is concatenated to the string.
    Line 3: When the numbers are before the beginning of a string, then the original calculation, in this case addition, is implemented, and then
    concatenated to the string.
     */
}
