package Chapter4.Lab44;

import java.util.Scanner;

public class TestNames {

    public static void main(String[] args) {

        Name name1;
        Name name2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Print first name for Person #1: ");
        String first1 = scan.nextLine();
        System.out.print("\nPrint middle name for Person #1: ");
        String middle1 = scan.nextLine();
        System.out.print("\nPrint last name for Person #1: ");
        String last1 = scan.nextLine();
        System.out.println();
        System.out.print("Print first name for Person #2: ");
        String first2 = scan.nextLine();
        System.out.print("\nPrint middle name for Person #2: ");
        String middle2 = scan.nextLine();
        System.out.print("\nPrint last name for Person #2: ");
        String last2 = scan.nextLine();

        name1 = new Name(first1,middle1,last1);
        name2 = new Name(first2,middle2,last2);

        System.out.println("Name #1: ");
        System.out.println("f-m-l version: " + name1.firstMiddleLast());
        System.out.println("l-f-m version: " + name1.lastFirstMiddle());
        System.out.println("Initials: " + name1.initials());
        System.out.println("Length: " + name1.length());

        System.out.println("Name #2: ");
        System.out.println("f-m-l version: " + name2.firstMiddleLast());
        System.out.println("l-f-m version: " + name2.lastFirstMiddle());
        System.out.println("Initials: " + name2.initials());
        System.out.println("Length: " + name2.length());

        if(name1.equals(name2)) {
            System.out.println("The names inputted are the same.");
        } else {
            System.out.println("The names inputted are not the same.");
        }


    }

}
