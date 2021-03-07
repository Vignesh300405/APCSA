package Chapter2.labexercises234;

//****************************************************************
// IdealWeight.java                      Project or Lab Name: Lab Exercises 2.3 - 2.4
//
//  Author: Vignesh Suresh Kumar         Date: September 23, 2020
//
// This program will compute the ideal weight for both males and females based on their height.
//****************************************************************


import java.util.Scanner;

public class IdealWeight {

    public static void main(String[] args) {
        int feet;
        int inches;
        final int FEMALE_DEFAULT_WEIGHT = 100;
        final int MALE_DEFAULT_WEIGHT = 106;
        final int FEMALE_INCH_MULTIPLIER = 5;
        final int MALE_INCH_MULTIPLIER = 6;
        int femaleIdealWeight;
        int maleIdealWeight;

        int femaleIdealLow;
        int femaleIdealHigh;
        int maleIdealLow;
        int maleIdealHigh;
        final double PERCENTAGE = 0.15;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input your height in feet. For example, if you are 5'3\", input 5.");
        feet = scan.nextInt();

        System.out.println("Input your height in inches. For example, if you are 5'3\", input 3.");
        inches = scan.nextInt();

        if(feet > 5) {
            int feetToInches = (feet - 5) * 12;
            inches += feetToInches;
        }

        femaleIdealWeight = FEMALE_DEFAULT_WEIGHT + (FEMALE_INCH_MULTIPLIER * inches);

        maleIdealWeight = MALE_DEFAULT_WEIGHT + (MALE_INCH_MULTIPLIER * inches);

        System.out.println("Female Ideal Weight: " + femaleIdealWeight + " lbs\nMale Ideal Weight: " + maleIdealWeight + " lbs\n");

    }


}
