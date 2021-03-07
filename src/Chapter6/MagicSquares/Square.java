package Chapter6.MagicSquares;

import java.util.Scanner;

public class Square {
   
    int[][] square;

    public Square(int size) {

        square = new int[size][size];

    }

    public int sumRow(int row) {

        int sum = 0;

        for(int i = 0; i < square.length; i++)
            sum += square[row - 1][i];

        return sum;

    }

    public int sumCol(int col) {


        int sum = 0;

        for(int i = 0; i < square.length; i++)
            sum += square[i][col - 1];

        return sum;

    }

    public int sumMainDiag() {

        int sum = 0;

        for(int i = 0; i < square.length; i++)
            sum += square[i][i];

        return sum;

    }

    public int sumOtherDiag() {

        int sum = 0;

        for(int i = 0; i < square.length; i++)
            sum += square[square.length - (1 + i)][square.length - (1 + i)];

        return sum;
    }

    public boolean magic() {

        int compareValue = sumMainDiag();
        boolean isMagic = true;

        for(int i = 1; i < square.length; i++) {

           if((sumRow(i) != compareValue) || (sumCol(i) != compareValue))
                isMagic = false;

        }

        if(compareValue != sumOtherDiag())
            isMagic = false;


        return isMagic;

    }

    public void readSquare(Scanner scan) {

        for(int row = 0; row < square.length; row++)
            for(int col = 0; col < square.length; col++)
                square[row][col] = scan.nextInt();

    }

    public void printSquare() {

        for(int i = 0; i < square.length; i++) {
            for(int j = 0; j < square.length; j++)
                System.out.print(square[i][j] + " ");
            System.out.println();
        }        
    }

}
