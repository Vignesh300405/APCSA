package Chapter4.Lab43;

import java.util.Scanner;

public class BandBoosterTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input name #1: ");
        BandBooster bandBooster1 = new BandBooster(scan.nextLine());


        System.out.print("\nInput name #1: ");
        BandBooster bandBooster2 = new BandBooster(scan.nextLine());

        for(int i = 0; i < 3; i++) {
            System.out.print("Enter the number of boxes sold by " + bandBooster1.getName() + " this week: ");
            bandBooster1.updateSales(scan.nextInt());
            System.out.println();
            System.out.print("Enter the number of boxes sold by " + bandBooster2.getName() + " this week: ");
            bandBooster2.updateSales(scan.nextInt());
            System.out.println();
        }

        System.out.print(bandBooster1 + "\n" + bandBooster2);

    }



}
