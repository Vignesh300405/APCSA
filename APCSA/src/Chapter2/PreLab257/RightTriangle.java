package Chapter2.PreLab257;

//****************************************************************
// RightTriangle.java                       Project or Lab Name: Lab Exercises 2.5 - 2.7
//
//  Author: Vignesh Suresh Kumar         Date: September 25, 2020
//
// This program is calculating the hypotenuse of a triangle given its legs.
//****************************************************************


import java.util.Scanner;

public class RightTriangle {

    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);

        double side1, side2;  // lengths of sides of a right triangle
        double hypotenuse;    // length of the hypotenuse

        // Get the lengths of the sides as input
        System.out.print  ("Please enter the lengths of the two sides" + " of a right triangle:  ");

        side1 = scan.nextDouble();
        side2 = scan.nextDouble();

        // Compute the length of the hypotenuse

        side1 = Math.pow(side1, 2);
        side2 = Math.pow(side2, 2);

        hypotenuse = Math.sqrt(side1 + side2);

        // Print the result
        System.out.println ("Length of hypotenuse: " + hypotenuse);
    }

}
