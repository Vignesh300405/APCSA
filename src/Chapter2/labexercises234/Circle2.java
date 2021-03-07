package Chapter2.labexercises234;

//****************************************************************
// Circle2.java                            Project or Lab Name: Lab Exercises 2.3 - 2.4
//
//  Author: Vignesh Suresh Kumar         Date: September 23, 2020
//
// Print the area of a circle with an input of one radius, with the other radius
// determined by multiplying the first radius by two.
//****************************************************************


import java.util.Scanner;

public class Circle2 {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        final double PI = 3.14159;

        int radius;
        int radius2;

        System.out.println("Radius of Circle #1: ");
        radius = scan.nextInt();
        radius2 = 2 * radius;

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("The area of a circle with radius " + radius +
                " is " + area);
        System.out.println("The circumference of a circle with radius " + radius  + " is " + circumference);

        double area2 = PI * radius2 * radius2;
        double circumference2 = 2 * PI * radius2;

        System.out.println("The area of a circle with radius " + radius2 +
                " is " + area2);
        System.out.println("The circumference of a circle with radius " + radius2  + " is " + circumference2);

        double areaChange = area2 / area;
        System.out.println("The area change between the two circles is: " + areaChange);

        double circumferenceChange = circumference2 / circumference;
        System.out.println("The circumference change between the two circles is: " + circumferenceChange);
    }

}
