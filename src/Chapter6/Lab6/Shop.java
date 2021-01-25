package Chapter6.Lab6;

import Chapter6.Item;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Shop {

    public static void main (String[] args) {
<<<<<<< Updated upstream

        Item item;
        String itemName;
        double itemPrice;
        int quantity;

        ArrayList<Item> cart = new ArrayList<>();
        double totalPrice;
        DecimalFormat df = new DecimalFormat("#.00");

        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";
<<<<<<< Updated upstream

	    do 
	    {
		System.out.print ("Enter the name of the item: "); 
		itemName = scan.nextLine();
=======

        Item item;
        String itemName;
        double itemPrice;
        int quantity;

        ArrayList<Item> cart = new ArrayList<>();
        double totalPrice;
        DecimalFormat df = new DecimalFormat("#.00");

        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";

        do {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();

            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();

            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();

            // *** create a new item and add it to the cart
>>>>>>> Stashed changes

            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);

            // *** print the contents of the cart using println

            System.out.println();
            System.out.println("Cart Items:");
            System.out.println("---------------");
            totalPrice = 0;
            for(Item aItem : cart) {

                System.out.println(aItem.getName());
                totalPrice += aItem.getQuantity() * aItem.getPrice();

            }
            System.out.println("Total Price: $" + df.format(totalPrice));

            System.out.println();
            System.out.println("Continue shopping (y/n)?");
            scan.nextLine();
            keepShopping = scan.nextLine();
            System.out.println();

        } while (keepShopping.equals("y"));
        System.out.println("Final Price: $" + df.format(totalPrice));
<<<<<<< Updated upstream
    public static void main (String[] args)
    {
=======
>>>>>>> Stashed changes

        do {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();

            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();

            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();

            // *** create a new item and add it to the cart

            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);

            // *** print the contents of the cart using println

            System.out.println();
            System.out.println("Cart Items:");
            System.out.println("---------------");
            totalPrice = 0;
            for(Item aItem : cart) {

                System.out.println(aItem.getName());
                totalPrice += aItem.getQuantity() * aItem.getPrice();

            }
            System.out.println("Total Price: $" + df.format(totalPrice));

            System.out.println();
            System.out.println("Continue shopping (y/n)?");
            scan.nextLine();
            keepShopping = scan.nextLine();
            System.out.println();

<<<<<<< Updated upstream
>>>>>>> Stashed changes
		System.out.print ("Continue shopping (y/n)? ");
		keepShopping = scan.nextLine();
	    }
	while (keepShopping.equals("y"));
<<<<<<< Updated upstream
=======
>>>>>>> test
>>>>>>> Stashed changes
=======
        } while (keepShopping.equals("y"));
        System.out.println("Final Price: $" + df.format(totalPrice));
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes

    }

}
