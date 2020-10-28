package programmingProjects119;


import java.util.Scanner;

public class programmingProject22 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type three numbers");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();

        int average = (int1 + int2 + int3) / 3;

        System.out.println("Average: " + average);
    }

}
