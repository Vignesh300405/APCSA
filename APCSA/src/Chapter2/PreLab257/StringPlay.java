package Chapter2.PreLab257;

//****************************************************************
// StringPlay.java                       Project or Lab Name: Lab Exercises 2.5 - 2.7
//
//  Author: Vignesh Suresh Kumar         Date: September 25, 2020
//
// This program is implementing methods of the String class to manipulate the name of a college name and its town.
//****************************************************************



public class StringPlay {

    public static void main (String[] args)
    {
        String college = new String ("WillyWonka College");

        String town = new String("Anytown, USA"); //part (a)

        int stringLength;
        String change1, change2, change3;

        stringLength = college.length(); //part (b)

        System.out.println (college + " contains " + stringLength + " characters.");

                change1 = college.toUpperCase(); //part (c)

        change2 = change1.replace("O", "*"); //part (d)

        change3 = college.concat(town); //part (e)

        System.out.println ("The final string is " + change3);
    }

}
