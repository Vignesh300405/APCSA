package Chapter6;


//****************************************************************
// Item.java                            Project or Lab Name: Lab Exercises 6.5 - 6.6
//
// Author: Vignesh Suresh Kumar         Date: January 26, 2021
//
// This object class creates the basis for the Item object, which is made up of a name,
// price, and quantity and allows for simple toString functionality and to extract all its values.
//****************************************************************

import java.text.DecimalFormat;

public class Item {
   
    private String name;
    private double price;
    private int quantity;

    DecimalFormat df = new DecimalFormat("#.00");

    public Item(String aName, double aPrice, int aQuantity) {

        name = aName;
        price = aPrice;
        quantity = aQuantity;

    }

    public String toString() {

        String part1 = name;
        // String part2 = String.format("%12f", df.format(price));
        // String part3 = String.format("%12f", quantity);
        // String part4 = String.format("%12f", df.format(price * quantity));

        // return part1 + part2 + part3 + part4;

        return (name + "\t" + df.format(price) + "\t" + quantity + "\t" + df.format(price * quantity));

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
