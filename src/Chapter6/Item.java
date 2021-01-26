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

        String part1 = name;
        String part2 = String.format("%12f", price);
        String part3 = String.format("%4d", quantity);
        String part4 = String.format("%12f", price * quantity);

        return part1 + part2 + part3 + part4;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuanitity() {
        return quantity;
    }

}
