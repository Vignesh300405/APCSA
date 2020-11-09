package Chapter3.Lab35;

//****************************************************************
// Factorials.java                      Project or Lab Name: Lab 3.5
//
//  Author: Vignesh Suresh Kumar         Date: October 27st, 2020
//
// This program will print out the factorial of the inputted number.
//****************************************************************

import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {

        int n;
        int n2;
        int factorialAmount = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input a non-negative number: ");
        n = scan.nextInt();

        while(n < 0) {
            System.out.println("Error: Please enter a non-negative number ");
            n = scan.nextInt();
        }

        if(n == 0) {
            factorialAmount = 0;
        } else {
            while(n > 1) {
                factorialAmount *= n;
                n--;
            }
        }

        System.out.println("The factorial for the inputted number is: " + factorialAmount);

    }

}
