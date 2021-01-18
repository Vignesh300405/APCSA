package Chapter3.Lab35;

//****************************************************************
// PowersOf2.java                      Project or Lab Name: Lab 3.5
//
//  Author: Vignesh Suresh Kumar         Date: October 27st, 2020
//
// This program will print out as many powers of 2 as requested by the user.
//****************************************************************

import java.util.Scanner;

public class PowersOf2 {

    public static void main(String[] args) {

        int numPowersOf2;
        int nextPowerOf2 = 1;
        int exponent = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("How many powers of 2 do you want?");
        numPowersOf2 = scan.nextInt();

        System.out.println("Here are the first " + numPowersOf2 + " powers of 2: ");

        while(exponent <= numPowersOf2) {

            System.out.println("2^" + exponent + " = " +
                    nextPowerOf2);

            nextPowerOf2 *= 2;
            exponent++;

        }

    }

}
