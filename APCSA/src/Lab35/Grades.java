package Lab35;

//****************************************************************
// Grades.java                      Project or Lab Name: Lab 3.5
//
//  Author: Vignesh Suresh Kumar         Date: October 27st, 2020
//
// This program will allow the user to continue inputting grades, and after the user
// is finished inputting, then it gives the amount of students and how many of them passed and failed.
//****************************************************************


import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        double grade;
        double sumOfGrades;
        int numStudents;
        int numPass;
        int numFail;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nGrade Processing Program\n");

        sumOfGrades = 0;
        numStudents = 0;
        numPass = 0;
        numFail = 0;

        System.out.println("Enter the first student's grade: ");
        grade = scan.nextDouble();

        while (grade >= 0) {
            sumOfGrades += grade;
            numStudents++;

            if(grade < 60) {
                numFail++;
            } else {
                numPass++;
            }

            System.out.print("Enter the next grade (a negative to quit): ");
            grade = scan.nextDouble();
        }

        if(numStudents > 0) {
            System.out.println("\nGrade Summary: ");
            System.out.println("Class Average: " +
                    sumOfGrades / numStudents);
            System.out.println("Number of Passing Grades: " +
                    numPass);
            System.out.println("Number of Failing Grades: " +
                    numFail);
        } else {
            System.out.println("No grades processed.");
        }
    }

}
