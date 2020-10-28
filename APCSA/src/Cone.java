
//****************************************************************
// Cone.java                      Project or Lab Name: Summative Lab Chapter 2 Cone
//
//  Author: Vignesh Suresh Kumar         Date: September 25, 2020
//
// This program will compute the volume of a cone given the radius and the height.
//****************************************************************

import java.util.Scanner;

public class Cone {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double radius;
        double height;
        double coneVolume;
        final double fraction = 1.0 / 3;

        System.out.println("Input the radius of the cone: ");
        radius = scan.nextDouble();

        System.out.println("Input the height of the cone: ");
        height = scan.nextDouble();

        coneVolume = fraction * Math.PI * Math.pow(radius, 2) * height;

        coneVolume = Math.round(coneVolume * 100.0) / 100.0;

        System.out.println("The volume of a cone with a radius of " + radius + " and a height of " + height + " is " + coneVolume + ".");


    }

}
