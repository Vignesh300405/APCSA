package Chapter6.Lab5;
import Chapter6.Item;

import java.util.Scanner;
import java.text.DecimalFormat;

import java.text.DecimalFormat;

public class ShoppingCartTest {

    public static void main(String[] args) {

        String name;
        double price;
        int quantity;

        Scanner scan = new Scanner(System.in);
<<<<<<< Updated upstream

        ShoppingCart sc = new ShoppingCart();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        
        double totalPrice = 0;
        int capacity = 0;

        System.out.println("Welcome.");
        String loop = "y";

=======

        ShoppingCart sc = new ShoppingCart();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        
        double totalPrice = 0;

        System.out.println("Welcome.");
        String loop = "y";
>>>>>>> Stashed changes

        do {
            System.out.print("Name of item: ");
            name = scan.nextLine();

            System.out.print("\nPrice of item: ");
            price = scan.nextDouble();

            System.out.print("\nQuantity of item: ");
            quantity = scan.nextInt();

            totalPrice += price * quantity;

            sc.addToCart(name, price, quantity);

            System.out.println(sc);

            System.out.println();
            System.out.println("Continue shopping (y/n)?");
            scan.nextLine();
            loop = scan.nextLine();
            System.out.println();

        } while(loop.equals("y"));

        System.out.println("Please pay: $" + df.format(totalPrice));

<<<<<<< Updated upstream
            capacity++;
            Item[] cart = new Item[capacity];
            totalPrice += price * quantity;

            sc.addToCart(name, price, quantity);

            System.out.println(sc);

            System.out.println();
            System.out.println("Continue shopping (y/n)?");
            scan.nextLine();
            loop = scan.nextLine();
            System.out.println();

        } while(loop.equals("y"));

        System.out.println("Please pay: $" + df.format(totalPrice));

=======
>>>>>>> Stashed changes
    }



}
