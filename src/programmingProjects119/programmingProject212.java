package programmingProjects119;


import java.util.Currency;
import java.util.Scanner;

public class programmingProject212 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quarters: ");
        double quarters = scanner.nextDouble();
        System.out.println("Dimes: ");
        double dimes = scanner.nextDouble();
        System.out.println("Nickels: ");
        double nickels = scanner.nextDouble();
        System.out.println("Pennies: ");
        double pennies = scanner.nextDouble();

        quarters *= 0.25;
        dimes *= 0.1;
        nickels *= 0.05;
        pennies *= 0.01;

        Currency USA = Currency.getInstance("USD");

        double total = (quarters+dimes+nickels+pennies);

        total = Math.floor(total*100) / 100;

        System.out.println("Total: " + USA.getSymbol() + total);


    }

}
