package programmingProjects119;

import java.util.Scanner;

public class programmingProject28 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1st X value: ");
        int x1 = scanner.nextInt();
        System.out.println("1st Y value: ");
        int y1 = scanner.nextInt();
        System.out.println("2nd X value: ");
        int x2 = scanner.nextInt();
        System.out.println("2nd Y value: ");
        int y2 = scanner.nextInt();

        double part1X = Math.pow(x2 - x1, 2);
        double part1Y = Math.pow(y2 - y1, 2);

        double part2 = Math.sqrt(part1X + part1Y);

        System.out.println("Distance between both points: " + part2);

    }

}
