package Chapter6;



import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {

        int[][] pitchArray = {
            {45, 105, 67},
            {81, 100, 93, 25, 128, 88},
            {45, 53},
            {79, 107, 53, 79},
            {11, 9, 3, 63, 20, 18, 3}
        };

        Scanner scan = new Scanner(System.in);
        String[] outputs = new String[5];

        for(int i = 0; i < pitchArray.length; i++) {

            int[] pitchCount = pitchArray[i];
            int maxPitch = Integer.MIN_VALUE;
            int minPitch = Integer.MAX_VALUE;
            int games = 0;
            int total = 0;

            for(int j = 0; j < pitchCount.length; j++) {

                games++;
                total += pitchCount[j];

                if(pitchCount[j] > maxPitch) {
                    maxPitch = pitchCount[j];
                }
                
                if(pitchCount[j] < minPitch) {
                    minPitch = pitchCount[j];
                }

            }

            int average = total / games;

            System.out.println();
            String outputString = "Pitcher #" + (i + 1) + " pitched " + 
                games + " games. His largest pitch count was: " + maxPitch
                + ", smallest was: " + minPitch + ", total was: " + total
                + ", and average pitch count was: " + average;

            System.out.println(outputString);
            outputs[i] = outputString;

        }

        System.out.println();
        System.out.print("Please pick a pitcher: ");    
        int pitcherNum = scan.nextInt();
        System.out.println();
        System.out.println(outputs[pitcherNum - 1]);


    }
    
}
