package APExam.Practice.TwoThousandSixteen;

public class Crossword {
    private Square[][] puzzle;    

    public Crossword(boolean[][] blackSquares) {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int numCount = 1;

        for(int i = 0; i < blackSquares.length; i++) {
            for(int j = 0; j < blackSquares[i].length; j++) {
                if(toBeLabeled(i, j, blackSquares)) {
                    puzzle[i][j] = new Square(false, numCount);
                    numCount++;
                } else if(!toBeLabeled(i, j, blackSquares) && !blackSquares[i][j]) {
                    puzzle[i][j] = new Square(false, 0);
                } else {
                    puzzle[i][j] = new Square(true, 0);
                }
            }
        } 
    }

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        boolean square = blackSquares[r][c];
        if(blackSquares[r - 1][c] || blackSquares[r][c - 1]) {
            return true;
        } else {
            return false;
        }
        
    }
}
