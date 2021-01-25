package Chapter6.Lab6;
import Chapter6.Item;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Shop {

    public static void main (String[] args) {

        Item item;
        String itemName;
        double itemPrice;
        int quantity;

        ArrayList<Item> cart = new ArrayList<>();
        double totalPrice;
        DecimalFormat df = new DecimalFormat("#.00");

        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";

	    do 
	    {
		System.out.print ("Enter the name of the item: "); 
		itemName = scan.nextLine();

		System.out.print ("Enter the unit price: ");
		itemPrice = scan.nextDouble();

		System.out.print ("Enter the quantity: ");
		quantity = scan.nextInt();

        // *** create a new item and add it to the cart
        
        Item newItem = new Item(itemName, itemPrice, quantity);
        cart.add(newItem);


        // *** print the contents of the cart object using println
        
        System.out.println(cart);


        } while (keepShopping.equals("y"));
        System.out.println("Final Price: $" + df.format(totalPrice));
    public static void main (String[] args)
    {

    Item item;
    ArrayList<Item> cart = new ArrayList<>();
	String itemName;
	double itemPrice;
    int quantity;

 	Scanner scan = new Scanner(System.in);

	String keepShopping = "y";

	do 
	    {
		System.out.print ("Enter the name of the item: "); 
		itemName = scan.nextLine();

		System.out.print ("Enter the unit price: ");
		itemPrice = scan.nextDouble();

		System.out.print ("Enter the quantity: ");
		quantity = scan.nextInt();

        // *** create a new item and add it to the cart
        
        Item newItem = new Item(itemName, itemPrice, quantity);
        cart.add(newItem);


        // *** print the contents of the cart object using println
        
        System.out.println(cart);


>>>>>>> Stashed changes
		System.out.print ("Continue shopping (y/n)? ");
		keepShopping = scan.nextLine();
	    }
	while (keepShopping.equals("y"));
<<<<<<< Updated upstream
=======
>>>>>>> test
>>>>>>> Stashed changes

    }

}
