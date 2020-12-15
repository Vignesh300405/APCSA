package Chapter6;


import java.lang.reflect.Array;
import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {

        final int SALESPEOPLE = 5;
        int[] sales;
        int sum;
        int maxSale = Integer.MIN_VALUE;
        int minSale = Integer.MAX_VALUE;


        Scanner scan = new Scanner(System.in);

        System.out.print("How many salespeople? ");
        sales = new int[scan.nextInt() + 1];

        for(int i = 1; i < sales.length; i++) {

            System.out.println("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();

        }


        System.out.println("\nSalesperson  Sales");
        System.out.println("--------------------");
        sum = 0;
        for(int i = 1; i < sales.length; i++) {

            System.out.println("     " + i + "        " + sales[i]);
            sum += sales[i];

        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sale: " + (sum / 5));

        for (int sale : sales) {

            if (maxSale < sale) {
                maxSale = sale;
            }

            if(minSale > sale) {
                minSale = sale;
            }

        }
        System.out.println("Maximum sale: " + maxSale);
        System.out.println("Minimum sale: " + minSale);

        System.out.println("Enter a value: ");
        int salesCheck = scan.nextInt();
        System.out.println("Users who exceeded this value: ");
        for(int i = 0; i < sales.length; i++) {

            if(salesCheck < sales[i]) {
                System.out.println("User " + i + " exceeded the value with " + sales[i]);
            }

        }

    }

}
