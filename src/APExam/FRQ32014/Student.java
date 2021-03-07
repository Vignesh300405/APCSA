package APExam.FRQ32014;

public class Student {

    String name;
    int absences;

    public Student(String newString, int newAbsences) {

        name = newString;
        absences = newAbsences;

    }
    public String getName() {
        return name;
    }

    public int getAbsenceCount() {
        return absences;
    }


}