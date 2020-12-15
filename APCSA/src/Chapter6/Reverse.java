package Chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        int[] array;

        Scanner scan = new Scanner(System.in);

        System.out.print("Input an Integer: ");
        array = new int[scan.nextInt()];

        System.out.print("Input " + array.length + " values: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length / 2; i++) {
            int x = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = x;
        }

        System.out.println(Arrays.toString(array));

    }

}
