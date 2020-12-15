package Chapter6;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        int[] answerKey;
        int correct;
        int percentCorrect;
        char loop = 'y';

        while(loop == 'y') {
            Scanner scan = new Scanner(System.in);

            System.out.print("How many questions are on the quiz? ");
            answerKey = new int[scan.nextInt()];

            System.out.print("Input the correct answers: ");
            for (int i = 0; i < answerKey.length; i++) {
                answerKey[i] = scan.nextInt();
            }

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
