package Chapter2.LabExercises2;

public class StudentGradeTable {

    public static void main(String[] args) {

        int johnLab= 37;
        int jacobLab= 21;
        int ericLab= 19;
        int johnBonus= 4;
        int jacobnBonus= 7;
        int ericBonus= 11;

        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////");
        System.out.println();
        System.out.println("Name\t\t\tLab\t\tBonus\tTotal");
        System.out.println("----\t\t\t---\t\t-----\t-----");
        System.out.println("John\t\t\t" + johnLab + "\t\t" + johnBonus + "\t\t" + (johnLab + johnBonus));
        System.out.println("Jacob\t\t\t" + jacobLab + "\t\t" + jacobnBonus + "\t\t" + (jacobLab+jacobnBonus));
        System.out.println("Eric\t\t\t" + ericLab + "\t\t" + ericBonus + "\t\t" + (ericLab + ericBonus));

    }

}
