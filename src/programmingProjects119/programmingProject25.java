package programmingProjects119;

import java.util.Scanner;

public class programmingProject25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input distance in miles: ");
        double mile = scanner.nextDouble();

        final double CONVERSION_FACTOR = 1.60935;

        double km = mile * CONVERSION_FACTOR;

        System.out.println("Distance in miles: " + mile);
        System.out.println("Distance in kilometers: " + km);


    }

}
