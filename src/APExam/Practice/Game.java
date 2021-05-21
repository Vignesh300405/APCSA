import java.util.*;

public class Game {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Slot Macine Game!");
        System.out.print("Do you want to begin (y)? ");
        String toBegin = scan.nextLine();

        while(toBegin.equals("y")) {
	    int payout = slotMachine(0);
	    System.out.print("Thank you for playing!\nDo you want to play again (y)? ");
	    toBegin = scan.nextLine();
        }

    }

    static int slotMachine(int payout) {
        int random1, random2, random3;

        random1 = (int) (Math.random() * 9);
        random2 = (int) (Math.random() * 9);
        random3 = (int) (Math.random() * 9);

	try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

	System.out.print("The slot machine number: ");

	try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	System.out.print(random1 + " ");

	try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	System.out.print(random2 + " ");

	try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println(random3); 

	if((random1 == random2) && (random1 == random3) && (random1 == 7)) {
	    System.out.println("You won $1000! Congrats!");
	    payout += 1000;
	} else if((random1 == random2) && (random1 == random3)) {
	    System.out.println("You won $5! Congrats!");
	    payout += 10;
	}

	return payout;
    }

}

