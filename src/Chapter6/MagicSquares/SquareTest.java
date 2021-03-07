package Chapter6.MagicSquares;



import java.util.Scanner;
import java.io.*;

public class SquareTest
{
    public static void main(String[] args) throws IOException
    {

        File file = new File("src/Chapter6/MagicSquares/magicData.txt");

        Scanner scan = new Scanner(file);

	    int count = 1;                 //count which square we're on
	    int size = scan.nextInt();     //size of next square

	    //Expecting -1 at bottom of input file
	    while (size != -1)
	    {

            //create a new Square of the given size
            
            Square sq = new Square(size);

            //call its read method to read the values of the square
            
            sq.readSquare(scan);

		    System.out.println("\n******** Square " + count + " ********");
            //print the square
            
            sq.printSquare();

            //print the sums of its rows
            
            for(int i = 0; i < size; i++)
                System.out.println("Row " + (i+1) + ": " + sq.sumRow(i+1));

		    //print the sums of its columns

            for(int i = 0; i < size; i++)
                System.out.println("Column " + (i+1) + ": " + sq.sumCol(i+1));

            //print the sum of the main diagonal
            
            System.out.println();
            System.out.println("Sum of Main Diagonal: " + sq.sumMainDiag());

            //print the sum of the other diagonal
            
            System.out.println("Sum of Other Diagonal: " + sq.sumOtherDiag());

            //determine and print whether it is a magic square
            
            System.out.println();
            System.out.println("Is it a Magic Square? " + sq.magic());

		    //get size of next square
            size = scan.nextInt();
            count++;

	    }

   }

}