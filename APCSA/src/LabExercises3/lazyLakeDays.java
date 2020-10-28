package LabExercises3;

//****************************************************************
// lazyLakeDays.java                      Project or Lab Name: Lab 3.2 Summative
//
//  Author: Vignesh Suresh Kumar         Date: October 21st, 2020
//
// This program will recommend what to do at Lazy Lake based on the inputted temperature.
//****************************************************************

import java.util.Scanner;

public class lazyLakeDays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the temperature? ");
        int temp = scan.nextInt();

        if((temp > 95) || (temp < 20)) {
            System.out.println("Visit our shops!");
        } else if (temp >= 80) {
            System.out.println("Try out swimming.");
        } else if (temp >= 60) {
            System.out.println("Try out tennis.");
        } else if (temp >= 40) {
            System.out.println("Try out golf.");
        } else {
            System.out.println("Try out skiing.");
        }

    }

}
