package Chapter6.Lab6;
import Chapter6.Item;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main (String[] args)
    {

	Item item;
	String itemName;
    double itemPrice;
    double totalPrice = 0;
    int quantity;
    ArrayList<Item> cart = new ArrayList<Item>();
    DecimalFormat df = new DecimalFormat("#.##");

 	Scanner scan = new Scanner(System.in);

	String keepShopping = "y";

    while(keepShopping.equals("y"))
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

        System.out.println();

        totalPrice = 0;
        
        String cartOutput = "\n\tShopping Cart\n";
        cartOutput += "Item\t\tUnit Price\tQuantity\tTotal\n";
        
        for(int i = 0; i < cart.size(); i++) {

            Item theItem = cart.get(i);

            if(cart.get(i) != null) {
                cartOutput += theItem + "\n";
                totalPrice = theItem.getPrice() * theItem.getQuanitity();
            }
        }

        cartOutput += "\nTotal Price: $" + df.format(totalPrice);

        System.out.println(cartOutput); 

        System.out.println();
        System.out.print ("Continue shopping (y/n)? ");
        scan.nextLine();
        keepShopping = scan.nextLine();
        System.out.println();
        }
        
        System.out.println("Total Price: $" + df.format(totalPrice));
	

    }
}
