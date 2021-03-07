package programmingProjects119;

import java.util.Scanner;

public class programmingProject210 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First side: ");
        double a = scanner.nextDouble();
        System.out.println("Second side: ");
        double b = scanner.nextDouble();
        System.out.println("Third side: ");
        double c = scanner.nextDouble();

        double s = (a + b + c) / 2;

        double sa = s - a;
        double sb = s - b;
        double sc = s - c;

        double area = Math.sqrt(s*sa*sb*sc);

        String areaString = String.format("%.4g%n", area);

        System.out.println("Area: " + areaString);
    }



}
