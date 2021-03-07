package Chapter3.Lab35;

//****************************************************************
// LoveCS.java                      Project or Lab Name: Lab 3.5
//
//  Author: Vignesh Suresh Kumar         Date: October 27st, 2020
//
// This program will print out a certain line along with other statistics based
// on the input from the user..
//****************************************************************

import java.util.Scanner;

public class LoveCS {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 1;
        int count2;
        int combine = 0;

        System.out.println("How many times do you want the message to be printed? ");
        final int LIMIT = scan.nextInt();


        while (count <= LIMIT) {
            System.out.println(count + " I love Computer Science!!");
            count++;
        }

        System.out.print("Printed this message " + LIMIT + " times. ");

        count2 = LIMIT;

        while(count2 != 0) {
            combine += count2;
            count2--;
        }

        System.out.println("The sum of the numbers from 1 to " + LIMIT + " is " + combine + ".");

    }

}
