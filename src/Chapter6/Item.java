package Chapter6;

public class Item {

    private String name;
    private double price;
    private int quantity;

    public Item(String aName, double aPrice, int aQuantity) {

        name = aName;
        price = aPrice;
        quantity = aQuantity;

    }

    public String toString() {
        return "Item Name: " + name + ", Item Price: $" + price + ", Item Quantity: " + quantity;
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
