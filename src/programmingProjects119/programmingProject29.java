package programmingProjects119;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programmingProject29 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius of the Sphere: ");
        int radius = scanner.nextInt();

        double volume = volumeCalc(radius);
        double surfaceArea = surfaceAreaCalc(radius);


        volume = Math.floor(volume* 10000)/ 10000;
        surfaceArea = Math.floor(surfaceArea * 10000) / 10000;



        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);


    }

    private static double surfaceAreaCalc(int radius) {

        double doubled = Math.pow(radius, 2);

        double surfaceAreaValue = 4 * Math.PI * doubled;

        return surfaceAreaValue;
    }

    private static double volumeCalc(int radius) {

        double triple = Math.pow(radius, 3);
        float fraction = 4/3;

        double volumeValue = triple * 4;
        volumeValue /= 3;
        volumeValue *= Math.PI;



        return volumeValue;
    }

}
