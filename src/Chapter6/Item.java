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

        String returnString = name;
        for(int i = 16; i > name.length(); i--) {
            returnString += " ";
        }
        returnString += df.format(price);
        for(int i = 16; i > df.format(price).length(); i--) {
            returnString += " ";
        }
        returnString += quantity;
        for(int i = 16; i > String.valueOf(quantity).length(); i--) {
            returnString += " ";
        }
        returnString += df.format(price * quantity);

        return returnString;

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
