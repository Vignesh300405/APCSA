package Chapter6.Lab5;
import Chapter6.Item;

//****************************************************************
// ShoppingCart.java                            Project or Lab Name: Lab Exercises 6.5
//
// Author: Vignesh Suresh Kumar         Date: January 26, 2021
//
// This class creates a Shopping Cart objects which simulates a shopping cart in real life
// with extra functionality, including calculating the total price along with basic functions
// like increasing capacity, item count, and adding items to the cart.
//****************************************************************

import java.text.DecimalFormat;


public class ShoppingCart {

    int itemCount;
    double totalPrice;
    int capacity;

    Item[] cart;
    DecimalFormat df = new DecimalFormat("#.00");

    public ShoppingCart() {
        capacity = 3;
        cart = new Item[capacity];
    }

    public void increaseSize() {
        Item[] temp = new Item[capacity+3];
        for(int i = 0; i < capacity; i++)
            temp[i] = cart[i];
        cart = temp;
        capacity = cart.length;
    }

    public void addToCart(String newName, double newPrice, int newQuantity) {
        Item newItem = new Item(newName, newPrice, newQuantity);

        if(itemCount >= cart.length) {
            increaseSize();
        }
        cart[itemCount] = newItem;
        itemCount++;

        totalPrice += newPrice * newQuantity;
    }

    public String toString() {

        String cartOutput = "\n\t\tShopping Cart\n";
        cartOutput += "Item\t\tUnit Price\tQuantity\tTotal\n";
        
        for(int i = 0; i < capacity; i++) {
            if(cart[i] != null) {
                cartOutput += cart[i] + "\n";
            }
        }

        cartOutput += "\nTotal Price: $" + df.format(totalPrice);

        return cartOutput;

    }

    
}
