package APExam.FRQ32014;

import java.util.List;

public class SeatingChart {

    private Student[][] seats;

    // Part A

    public SeatingChart(List<Student> studentList, int rows, int cols) {

        seats = new Student[rows][cols];

        int studentsAdded = 0;

        for(int i = 0; i < seats.length; i++) {

            for(int j = 0; j < seats[i].length; j++) {

                if(studentsAdded >= studentList.size()) {
                    seats[i][j] = null;
                } else {
                    seats[i][j] = studentList.get(studentsAdded);
                }

                studentsAdded++;

            }

        }

    }

    // Part B

    public int removeAbsentStudents(int allowedAbsences) {

        int removal = 0;

        for (int i = 0; i < seats.length; i++) {

            for (int j = 0; j < seats[i].length; j++) {

                if(seats[i][j] != null) {

                    if(seats[i][j].getAbsenceCount() > allowedAbsences) {
                        seats[i][j] = null;
                        removal++;
                    }

                }

            }

        }

        return removal;



    }

}