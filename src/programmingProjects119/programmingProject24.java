package programmingProjects119;

import java.util.Scanner;

public class programmingProject24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a Fahrenheit temperature value: ");
        int fahrenheit = scanner.nextInt();

        final int BASE = 32;
        final double CONVERSION_FACTOR = 5.0/9.0;

        double celsiusTemp = (fahrenheit - BASE) * CONVERSION_FACTOR;

        System.out.println("Fahrenheit Temperature: " + fahrenheit);
        System.out.println("Calculated Celsius Temperature: " + celsiusTemp);

    }

}
