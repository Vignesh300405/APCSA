package Chapter3.Lab37;

import java.util.Scanner;

public class Count {

    public static void main (String[] args)
    {
        String phrase;    // a string of characters
        int countBlank;   // the number of blanks in the phrase
        int countA;
        int countE;
        int countS;
        int countT;
        int length;       // the length of the phrase
        char ch;          // an individual character in the string

        Scanner scan = new Scanner(System.in);

        // Print a program header
        System.out.println ();
        System.out.println ("Character Counter");
        System.out.println ();

        // Read in a string and find its length
        System.out.print ("Enter a sentence or phrase: ");
        phrase = scan.nextLine();
        length = phrase.length();

        while(!phrase.equals("quit")) {
            // Initialize counts
            countBlank = 0;
            countA = 0;
            countE = 0;
            countS = 0;
            countT = 0;

            // a for loop to go through the string char by char
            // and count the blank spaces

            for(int i = 0; i < length; i++) {

                ch = phrase.charAt(i);

                switch (ch) {
                    case ' ':
                        countBlank++;
                        break;
                    case 'a':
                    case 'A':
                        countA++;
                        break;
                    case 'e':
                    case 'E':
                        countE++;
                        break;
                    case 's':
                    case 'S':
                        countS++;
                        break;
                    case 't':
                    case 'T':
                        countT++;
                        break;
                    default:
                        break;
                }
            }

                // Print the results
                System.out.println ();
                System.out.println ("Number of blank spaces: " + countBlank);
                System.out.println("Number of A's: " + countA);
                System.out.println("Number of E's: " + countE);
                System.out.println("Number of S's: " + countS);
                System.out.println("Number of T's: " + countT);
                System.out.println ();

                System.out.print ("Enter a sentence or phrase (or quit if you want to quit the program): ");
                phrase = scan.nextLine();
                length = phrase.length();
        }
    }
}



