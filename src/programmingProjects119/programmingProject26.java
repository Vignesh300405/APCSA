package programmingProjects119;

import java.util.Scanner;

public class programmingProject26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type Hours, Minutes, and Seconds, pressing enter after typing each separate value.");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        final int HOURS_TO_SECONDS = 3600;
        final int MINUTES_TO_SECONDS = 60;

        int secondsTotal = (hours * HOURS_TO_SECONDS) + (minutes * MINUTES_TO_SECONDS) + seconds;

        System.out.println("Time in seconds: " + secondsTotal);

    }

}
