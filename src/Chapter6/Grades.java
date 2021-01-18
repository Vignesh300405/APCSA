package Chapter6;

import java.util.Scanner;


//****************************************************************
// Grades.java                            Project or Lab Name: Lab Exercises 6.2
//
// Author: Vignesh Suresh Kumar         Date: January 8, 2021
//
// This program is meant to create a means for a teacher to grade multiple quizzes,
// allowing for the teacher to input the amount of questions, the answer key, and a 
// loop for inputting student answers and receiving a percent and amount right out the
// total question amount.
//****************************************************************

public class Grades {

    public static void main(String[] args) {

        int[] answerKey;
        int correct;
        int percentCorrect;
        char loop = 'y';

        Scanner scan = new Scanner(System.in);

        System.out.print("How many questions are on the quiz? ");
        answerKey = new int[scan.nextInt()];

        System.out.print("Input the correct answers: ");
        for (int i = 0; i < answerKey.length; i++) {
            answerKey[i] = scan.nextInt();
        }

        while(loop == 'y') {

            System.out.print("Input the answers from a student's quiz: ");
            correct = 0;
            for (int i = 0; i < answerKey.length; i++) {
                if (answerKey[i] == scan.nextInt())
                    correct++;
            }

            percentCorrect = (correct) * 100;

            System.out.println("\nNumber correct: " + correct);
            System.out.println("Percent correct: " + percentCorrect / answerKey.length + "%");

            System.out.print("Grade another quiz? (y/n)");
            loop = scan.next().charAt(0);
        }



    }

}
