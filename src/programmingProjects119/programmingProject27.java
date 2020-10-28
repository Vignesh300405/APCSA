package programmingProjects119;

import java.util.Scanner;

public class programmingProject27 {

    int seconds;
    int minutes;
    int remainingSeconds;
    int remainingMinutes;
    int hours;

    final int CONVERSION_FACTOR = 60;

    public static void main(String[] args) {

        int seconds;
        int minutes;
        int remainingSeconds;
        int remainingMinutes = 0;
        int hours = 0;

        final int CONVERSION_FACTOR = 60;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the time in seconds: ");

        seconds = scanner.nextInt();



        minutes = seconds / CONVERSION_FACTOR;
        remainingSeconds = seconds % CONVERSION_FACTOR;

        if(minutes / CONVERSION_FACTOR >= 1) {

            hours = minutes / CONVERSION_FACTOR;
            remainingMinutes = minutes % CONVERSION_FACTOR;

        }


        if(remainingMinutes == 0 && hours > 0) {
            minutes = 0;
        } else {
            minutes = minutes % CONVERSION_FACTOR;
        }

        System.out.println(hours + " Hours, " + minutes + " Minutes, " + remainingSeconds + " Seconds");

    }

}
