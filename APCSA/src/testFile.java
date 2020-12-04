import java.util.Scanner;

public class testFile {

    public static void main(String[] args) {
        FootballPlayer fp1 = new FootballPlayer("Julio Jones", "Wide Receiver", "Atlanta Trashcans");
        FootballPlayer fp2 = new FootballPlayer("Younghoe Koo", "Kicker", "Atlanta Trashcans");

        fp1.setTeam("Atlanta Falcons");
        fp2.setTeam("Atlanta Falcons");

        System.out.println(fp1.getTeam() + "\n" + fp2.getTeam());

        for(int i = 0; i < 10; i++) {
            fp1.increaseYears();
        }

        fp2.increaseYears();

        System.out.println(fp1.equals(fp2));

        System.out.println(fp1.toString());
        System.out.println(fp2.toString());

    }
}











