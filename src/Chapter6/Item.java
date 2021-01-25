package Chapter6;

import java.text.DecimalFormat;

import java.text.DecimalFormat;

public class Item {

    private String name;
    private double price;
    private int quantity;

    public Item(String aName, double aPrice, int aQuantity) {

        name = aName;
        price = aPrice;
        quantity = aQuantity;
    DecimalFormat df = new DecimalFormat("#.00");

    public Item(String itemName, double itemPrice, int itemQuantity) {

        name = itemName;
        price = itemPrice;
        quantity = itemQuantity;
    DecimalFormat df = new DecimalFormat("#.00");

    public Item(String itemName, double itemPrice, int itemQuantity) {

        name = itemName;
        price = itemPrice;
        quantity = itemQuantity;

    }

    public String toString() {
        return "Item Name: " + name + ", Item Price: $" + price + ", Item Quantity: " + quantity;
        // return name + "\t\t" + df.format(price) + "\t\t" + quantity + "\t\t" + df.format(price * quantity);
        return String.format("%-17s %-17s %-17s %-17s", name, df.format(price), quantity, df.format(price * quantity));
        // return name + "\t\t" + df.format(price) + "\t\t" + quantity + "\t\t" + df.format(price * quantity);
        return String.format("%-17s %-17s %-17s %-17s", name, df.format(price), quantity, df.format(price * quantity));
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


}
}
}
