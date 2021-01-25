package Chapter6;

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
import java.text.DecimalFormat;

=======
>>>>>>> test
>>>>>>> Stashed changes
public class Item {

    private String name;
    private double price;
    private int quantity;

<<<<<<< Updated upstream
    public Item(String aName, double aPrice, int aQuantity) {

        name = aName;
        price = aPrice;
        quantity = aQuantity;
=======
<<<<<<< HEAD
    DecimalFormat df = new DecimalFormat("#.00");

    public Item(String itemName, double itemPrice, int itemQuantity) {

        name = itemName;
        price = itemPrice;
        quantity = itemQuantity;
=======
    public Item(String aName, double aPrice, int aQuantity) {

        name = aName;
        price = aPrice;
        quantity = aQuantity;
>>>>>>> test
>>>>>>> Stashed changes

    }

    public String toString() {
<<<<<<< Updated upstream
        return "Item Name: " + name + ", Item Price: $" + price + ", Item Quantity: " + quantity;
=======
<<<<<<< HEAD
        // return name + "\t\t" + df.format(price) + "\t\t" + quantity + "\t\t" + df.format(price * quantity);
        return String.format("%-17s %-17s %-17s %-17s", name, df.format(price), quantity, df.format(price * quantity));
=======
        return "Item Name: " + name + ", Item Price: $" + price + ", Item Quantity: " + quantity;
>>>>>>> test
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream

}
=======
<<<<<<< HEAD
}
=======

}
>>>>>>> test
>>>>>>> Stashed changes
