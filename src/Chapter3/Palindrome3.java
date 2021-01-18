package Chapter3;

import java.util.ArrayList;
import java.util.Scanner;

// _   _       _     _    _            _    _
//| \ | |     | |   | |  | |          | |  (_)
//|  \| | ___ | |_  | |  | | ___  _ __| | ___ _ __   __ _
//| . ` |/ _ \| __| | |/\| |/ _ \| '__| |/ / | '_ \ / _` |
//| |\  | (_) | |_  \  /\  / (_) | |  |   <| | | | | (_| |
//\_| \_/\___/ \__|  \/  \/ \___/|_|  |_|\_\_|_| |_|\__, |
//                                                   __/ |
//                                                  |___/


public class Palindrome3 {

    public static void main(String[] args) {

        String input;
        double length;
        int lengthCounter = 0;
        double halfLengthTest;
        int halfLength;
        ArrayList<String> halfInput = new ArrayList<>();
        boolean isPalindrome;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input a string: ");
        input = scan.nextLine();

        while(!input.equals("")) {

            length = input.length();
            halfLengthTest = length / 2;
            halfLength = (int) Math.ceil(halfLengthTest);



            while(lengthCounter != halfLength) {

                halfInput.add(String.valueOf(input.charAt(lengthCounter)));
                lengthCounter++;

            }

            if((length % 2) == 0) {
                halfInput.add(String.valueOf(input.charAt(lengthCounter)));
                lengthCounter++;
            }

            while((lengthCounter > halfLength) && (lengthCounter < length)) {

                String charAtInput = String.valueOf(input.charAt(lengthCounter)).toLowerCase();
                String charAtReflection = String.valueOf(halfInput.get(lengthCounter - halfLength)).toLowerCase();
                if(!charAtInput.equals(charAtReflection)) {
                    System.out.println("String: " + input + "\nThe input given is not a palindrome");
                    break;
                }

                if(lengthCounter == length) {
                    System.out.println("String: " + input + "\nThe input given is a palindrome");
                }

                lengthCounter++;





            }

            System.out.println("Do you want to check if another input is a palindrome? If not, input end (all lowercase): " + length);
            if(scan.nextLine().equals("end")) {
                break;
            } else {
                System.out.println("Input a string: ");
                input = scan.nextLine();
                lengthCounter = 0;
            }


        }





    }

}
