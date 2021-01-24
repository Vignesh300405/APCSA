package Chapter6.Lab5;

import java.util.Scanner;

import Chapter6.Item;

public class ShoppingCartTest {

    public static void main(String[] args) {

        String name;
        double price;
        int quantity;
        int itemCount = 0;
        double totalPrice = 0;
        int capacity = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome.");
        boolean loop = true;

        if(loop) {

            System.out.print("Name of item: ");
            name = scan.nextLine();

            System.out.print("\nPrice of item: ");
            price = scan.nextDouble();

            System.out.print("\nQuantity of item: ");
            quantity = scan.nextInt();

            Item item = new Item(name, price, quantity);

            capacity++;
            Item[] cart = new Item[capacity];
        }
    }



}
