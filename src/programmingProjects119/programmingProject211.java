package programmingProjects119;

import java.util.Scanner;

public class programmingProject211 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Print gallons used, starting point in miles, and ending point in miles on the odometer, each on a separate line after entered");
        float gallons = scanner.nextFloat();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int miles = end - start;

        float mpg = gallons / miles;

        System.out.println("Miles per gallon: " + mpg);


    }

}
