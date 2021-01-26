package Chapter6.Lab5;
import Chapter6.Item;

//****************************************************************
// ShoppingCartSim.java                            Project or Lab Name: Lab Exercises 6.5
//
// Author: Vignesh Suresh Kumar         Date: January 26, 2021
//
// This file runs a simulation of a shopping experience, using the previous Item and
// ShoppingCart classes to create a clean interface to add, view, and see the final price
// of an item.
//****************************************************************

import java.text.DecimalFormat;
import java.util.Scanner;

public class ShoppingCartSim {

    
    public static void main(String[] args) {

        String name;
        double price;
        int quantity;
        double totalPrice = 0;

        ShoppingCart sc = new ShoppingCart();
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner scan = new Scanner(System.in);

        String loop = "y";

        do {

            System.out.println("Print name of the item: ");
            name = scan.nextLine();

            System.out.println("Print price of the item: ");
            price = scan.nextDouble();

            System.out.println("Print quantity of the item: ");
            quantity = scan.nextInt();

            sc.addToCart(name, price, quantity);
            totalPrice += price * quantity; 

            System.out.println(sc);

            System.out.println();
            System.out.print("Continue shopping? (y/n)");
            scan.nextLine();
            loop = scan.nextLine();
            System.out.println();

        } while (loop.equals("y"));
        System.out.println("Please pay: $" + df.format(totalPrice));

    }

}
