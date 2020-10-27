package programmingProjects119;

import java.util.Scanner;

public class programmingProject23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Print two floating point values: ");
        
        float float1 = scanner.nextFloat();
        float float2 = scanner.nextFloat();

        float sum = float1 + float2;
        float diff = float1 - float2;
        float product = float1 * float2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);

    }

}
