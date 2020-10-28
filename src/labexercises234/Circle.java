package labexercises234;

//****************************************************************
// Circle.java                            Project or Lab Name: Lab Exercises 2.3 - 2.4
//
//  Author: Vignesh Suresh Kumar         Date: September 23, 2020
//
// Print the area of a circle with two different radii
//****************************************************************


import java.util.Scanner;

public class Circle {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.println("Input a radius value: ");
        int radius = scan.nextInt();
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("The area of a circle with radius " + radius +
                " is " + area);
        System.out.println("The circumference of a circle with radius " + radius  + " is " + circumference);

        radius *= 2;
        double area2 = PI * radius * radius;
        double circumference2 = 2 * PI * radius;

        System.out.println("The area of a circle with radius " + radius +
                " is " + area2);
        System.out.println("The circumference of a circle with radius " + radius  + " is " + circumference2);

        double areaChange = area / area2;
        System.out.println("The area change between the two circles is: " + areaChange);

        double circumferenceChange = circumference / circumference2;
        System.out.println("The circumference change between the two circles is: " + circumferenceChange);
    }

}
