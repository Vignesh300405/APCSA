import java.util.Scanner;

public class Temps2 {

    public static void main (String[] args)
    {
        final int HOURS_PER_DAY = 5;

        int temp;   // a temperature reading
        int maxTemp = Integer.MIN_VALUE;
        int minTemp = Integer.MAX_VALUE;
        int timeOfMax = 0;
        int timeOfMin = 0;

        Scanner scan = new Scanner(System.in);

        // print program heading
        System.out.println ();
        System.out.println ("Temperature Readings for 24 Hour"     + " Period");
        System.out.println ();

        for (int hour = 0; hour < HOURS_PER_DAY; hour++)
        {
            System.out.print ("Enter the temperature reading at " + hour + " hours: ");
            temp = scan.nextInt();

            if(temp > maxTemp) {
                maxTemp = temp;
                timeOfMax = hour;
            }

            if(temp < minTemp) {
                minTemp = temp;
                timeOfMin = hour;
            }

            System.out.println("Maximum Temperature: " + maxTemp + " at " + timeOfMax + " hours.");
            System.out.println("Maximum Temperature: " + minTemp + " at " + timeOfMin + " hours.");

        }

        // Print the results
    }


}
