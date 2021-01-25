package Chapter6.Lab5;

import java.util.Scanner;

import Chapter6.Item;

import java.text.DecimalFormat;

public class ShoppingCartTest {

    public static void main(String[] args) {

        String name;
        double price;
        int quantity;

        Scanner scan = new Scanner(System.in);

        ShoppingCart sc = new ShoppingCart();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        
        double totalPrice = 0;
        int capacity = 0;

        System.out.println("Welcome.");
        String loop = "y";


        do {
            System.out.print("Name of item: ");
            name = scan.nextLine();

            System.out.print("\nPrice of item: ");
            price = scan.nextDouble();

            System.out.print("\nQuantity of item: ");
            quantity = scan.nextInt();

            Item item = new Item(name, price, quantity);

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

    }



}
