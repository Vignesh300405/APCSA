package LabExercises3;

//****************************************************************
// chargeAccount.java                      Project or Lab Name: Lab 3.2 Summative
//
//  Author: Vignesh Suresh Kumar         Date: October 21st, 2020
//
// This program will compute the new balance and minimum payment based
// on the inputted previous balance and additional charges.
//****************************************************************

import java.text.NumberFormat;
import java.util.Scanner;

public class chargeAccount {

    public static void main(String[] args) {

        double previousBalance;
        double charges;

        double interest;
        double newBalance;
        double minimumPayment;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input your previous balance: ");
        previousBalance = scan.nextDouble();
        System.out.println("Input your additional charges: ");
        charges = scan.nextDouble();

        if(previousBalance == 0) {
            interest = 0;
        } else {
            interest = (previousBalance + charges) * 0.02;
        }

        newBalance = previousBalance + charges + interest;

        if(newBalance < 50) {
            minimumPayment = newBalance;
        } else if((newBalance >= 50) && (newBalance <= 300)) {
            minimumPayment = 50;
        } else {
            minimumPayment = newBalance * 0.2;
        }

        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.println();
        System.out.println("Previous Balance:      " + money.format(previousBalance));
        System.out.println("Additional Charges:    " + money.format(charges));
        System.out.println("Interest:              " + money.format(interest));
        System.out.println();
        System.out.println("New Balance:           " + money.format(newBalance));
        System.out.println();
        System.out.println("Minimum Payment:       " + money.format(minimumPayment));

    }

}
