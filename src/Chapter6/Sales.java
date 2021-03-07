package Chapter6;


//****************************************************************
// Sales.java                            Project or Lab Name: Lab Exercises 6.1
//
// Author: Vignesh Suresh Kumar         Date: January 8, 2021
//
// Determine various statistics based upon a number of salespeople and the
// amount of sales for each salesperson.
//****************************************************************

import java.util.Scanner;

public class Sales {
    
    public static void main(String[] args) {
        int sum;
        int maxSale = Integer.MIN_VALUE;
        int minSale = Integer.MAX_VALUE;

        Scanner scan = new Scanner(System.in);

        System.out.println("Number of salespeople: ");
        int[] sales = new int[scan.nextInt() + 1];

        
	    for (int i=1; i<sales.length; i++)
	    {
            if(i == 1) {sales[0] = 1;}
		    System.out.print("Enter sales for salesperson " + i + ": ");
		    sales[i] = scan.nextInt();
	    }

	    System.out.println("\nSalesperson   Sales");
	    System.out.println("--------------------");
        sum = 0;
        

	    for (int i=1; i<sales.length; i++)
	    {
            if(maxSale < sales[i]) {
                maxSale = sales[i];
            }
            if(minSale > sales[i]) {
                minSale = sales[i];
            }
	    	System.out.println("     " + i + "         " + sales[i]);
		    sum += sales[i];
        }
        

        System.out.println("\nTotal sales: " + sum); 
        System.out.println("Average sale: " + (sum / (sales.length - 1)));
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
