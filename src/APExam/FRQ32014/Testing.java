package APExam.FRQ32014;

import java.util.List;
import java.util.ArrayList;

public class Testing {
    
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Karen", 3));
        list.add(new Student("Lester", 1));
        list.add(new Student("Glen", 2));
        list.add(new Student("Danny", 3)); 
        list.add(new Student("Liz", 1)); 
        list.add(new Student("Henry", 5)); 
        list.add(new Student("Fran", 6)); 
        list.add(new Student("Paul", 4)); 
        list.add(new Student("Renee", 9)); 
        list.add(new Student("David", 1)); 

        SeatingChart sc = new SeatingChart(list, 4, 3);

        System.out.println(sc.removeAbsentStudents(4));

    }

}
