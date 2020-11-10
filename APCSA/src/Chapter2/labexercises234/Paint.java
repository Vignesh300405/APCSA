package Chapter2.labexercises234;


//****************************************************************
// Paint.java                            Project or Lab Name: Lab Exercises 2.3 - 2.4
//
//  Author: Vignesh Suresh Kumar         Date: September 23, 2020
//
// Determine how much paint is needed to paint the walls
// of a room given its length, width, and height
//****************************************************************


import java.util.Scanner;

public class Paint {

    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        //declare integers length, width, and height;
        int length;
        int width;
        int height;
        int door;
        int window;
        //declare double totalSqFt;
        double totalSqFt;
        //declare double paintNeeded;
        double paintNeeded;
        final int doorSqFt = 20;
        final int windowSqFt = 15;
        //declare and initialize Scanner object
        Scanner scan = new Scanner(System.in);

        //Prompt for and read in the length of the room
        System.out.println("Length: ");
        length = scan.nextInt();

        //Prompt for and read in the width of the room
        System.out.println("Width: ");
        width = scan.nextInt();

        //Prompt for and read in the height of the room
        System.out.println("Height: ");
        height = scan.nextInt();

        System.out.println("# of doors: ");
        door = scan.nextInt();

        System.out.println("# of windows: ");
        window = scan.nextInt();

                //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        totalSqFt = (2*length*height) + (2*width*height) + (door * doorSqFt) + (window * windowSqFt);

        //Compute the amount of paint needed
        paintNeeded = totalSqFt / COVERAGE;

        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Doors: " + door);
        System.out.println("Windows: " + window);
        System.out.println("Gallons of Paint Needed: " + paintNeeded);
    }

}
