package Chapter2.PreLab257;

//****************************************************************
// StringManips.java                       Project or Lab Name: Lab Exercises 2.5 - 2.7
//
//  Author: Vignesh Suresh Kumar         Date: September 25, 2020
//
// This program is showcasing the abilities of the String class and implementing
// some of the methods in that class.
//****************************************************************


import java.util.Scanner;

public class StringManips {

    public static void main (String[] args)
    {
        String phrase = new String ("This is a String test.");
        int phraseLength;   // number of chars in the phrase String
        int middleIndex;    // index of the middle char in the String
        String firstHalf;   // first half of the phrase String
        String secondHalf;  // second half of the phrase String
        String switchedPhrase; //a new phrase w/ orig halves switched
        String middle3;
        String city;
        String state;
        String cityState;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the city and state name of your hometown: ");
        city = scan.nextLine();
        state = scan.nextLine();

        // compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;

        // get the substring for each half of the phrase
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);

        middle3 = phrase.substring(middleIndex - 1, middleIndex + 1);

        state = state.toUpperCase();
        city = city.toLowerCase();

        // concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);
        switchedPhrase = switchedPhrase.replace(" ", "*");

        cityState = state + city + state;

        // print information about the phrase
        System.out.println();
        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength +
                " characters");
        System.out.println ("Index of the middle: " + middleIndex);
        System.out.println ("Character at the middle index: " +
                phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println("Middle 3 letters: " + middle3);
        System.out.println(cityState);
        System.out.println();
    }

}
