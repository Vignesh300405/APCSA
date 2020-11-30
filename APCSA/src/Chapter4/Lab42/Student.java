package Chapter4.Lab42;

import java.util.Scanner;

public class Student {

    //declare instance data
    String name;
    int test1;
    int test2;

    Scanner scan = new Scanner(System.in);

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        name = studentName;

    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        System.out.print("Input " + name + "'s grade for Test #1: ");
        test1 = scan.nextInt();
        System.out.println();
        System.out.print("Input " + name + "'s grade for Test #2: ");
        test2 = scan.nextInt();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    public int getAverage()//add header for getAverage
    {
        //add body of getAverage
        return (test1 + test2) / 2;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    public void getName()//add header for printName
    {
        //add body of printName
        System.out.print(name);
    }

    @Override
    public String toString() {
        return "Name: " +
                name + " " +
                "Test1: " +
                test1 + " " +
                "Test2: " +
                test2;
    }
}
