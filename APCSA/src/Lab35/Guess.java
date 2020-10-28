package Lab35;

//****************************************************************
// Guess.java                      Project or Lab Name: Lab 3.5
//
//  Author: Vignesh Suresh Kumar         Date: October 27st, 2020
//
// This program will ask for a user to guess a number between 1 and 100
// until the user gets the number correct, and they will be presented if the number
// is too high or too low, and be given the total amount of guesses in the end.
//****************************************************************

import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {

        int numToGuess;
        int guess;
        int amountOfGuesses = 1;

        Scanner scan = new Scanner(System.in);

        numToGuess = (int) (Math.random() * (100 - 1) + 1);

        System.out.println("Guess a number between 1 and 100.");
        guess = scan.nextInt();

        while(guess != numToGuess) {

            if(guess > numToGuess) {
                System.out.println("Sorry. Try again. Your guess was too high.");
            } else {
                System.out.println("Sorry. Try again. Your guess was too low.");
            }

            amountOfGuesses++;

            System.out.println("Input another number to try again: ");
            guess = scan.nextInt();
        }

        System.out.println("Your guess is right, and it took you " + amountOfGuesses + " tries.");
    }

}
