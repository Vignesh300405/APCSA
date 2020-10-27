import java.util.Scanner;

public class testFile {

    public static void main(String[] args) {
        String str = "WooHoo";

        int length1 = str.length();

        int half = (length1) / 2;

        str = str.substring(0,half);

        System.out.println(str);


    }

}
