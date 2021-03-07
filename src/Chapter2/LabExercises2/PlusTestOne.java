package Chapter2.LabExercises2;

public class PlusTestOne {

    public static void main(String[] args) {
        String str;

        str = "Alpharetta " + "Rocks!";
        System.out.print(str);

        str = "Countdown: " + 5 + 4 + 3 + 2 + 1 + 0;
        System.out.print(str);

        str = 1 + 2 + 3 + "Go!";
        System.out.print(str);

    }
    /*
    I have realized that the addition symbol takes the priority of addition when there is no concatenation of string before it, but when there is a string,
    then the addition symbol and digits have to be inside parentheses for the addition to occur.
     */

}
