package Chapter6.Lab5;

import Chapter6.Item;

import java.text.DecimalFormat;

public class ShoppingCart {

    int itemCount = 0;
    double totalPrice;
    int capacity = 3;

    Item[] cart = new Item[capacity];

    public void increaseSize() {

        Item[] temp = new Item[capacity+3];
        for(int i=0; i < capacity; i++)
            temp[i] = cart[i];
        cart = temp;
        capacity = cart.length;

    }

    public void addToCart(String newName, double newPrice, int newQuantity) {

        Item newItem = new Item(newName, newPrice, newQuantity);

        totalPrice += newPrice * newQuantity;

        cart[itemCount] = newItem;
        itemCount++;

        if(itemCount == capacity) {
            increaseSize();
        }

    }

    public String toString() {

        String returnString = "\nShopping Cart";
        returnString += "\nItem\t\tUnit Price\tQuantity\t\tTotal\n";

        for(int i = 0; i < cart.length; i++) {
            if(cart[i] != null) {
            returnString += cart[i] + "\n";
            }
        }
        returnString += "\nTotal Price: $" + totalPrice;

        return returnString;

    }

}
