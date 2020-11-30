package Chapter4.Lab42;

public class Grades {

    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");
        //create student2, "Mike"

        //input grades for Mary
        student1.inputGrades();
        //print average for Mary
        System.out.println(student1);
        System.out.print("The average for ");
        student1.getName();
        System.out.print(" is " + student1.getAverage());

        System.out.println();

        //input grades for Mike
        student2.inputGrades();
        //print average for Mike
        System.out.println(student2);
        System.out.print("The average for ");
        student2.getName();
        System.out.print(" is " + student2.getAverage());
        System.out.println(student2);

    }

}
