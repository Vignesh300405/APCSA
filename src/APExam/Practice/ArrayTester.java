public class ArrayTester {

    public static void main(String[] args) {

        int[] array = {1, 2, 1, 3, 4};
        int[][] arr2d = {{1, 2, 1, 3, 4}, {5, 6, 3, 8, 4}};

        System.out.println(containingDuplicates(array));
        System.out.println();
        for(int val : getColumn(arr2d, 4))
            System.out.print(val + " ");
        System.out.println();


    }

    static boolean containingDuplicates(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if( (i != j) && (arr[i] == arr[j]) ) {
                    return true;
                }
            }
        }
        return false;
    }

    static int[] getColumn(int[][] arr2D, int c) {
        int[] returnArray = new int[arr2D.length];

        for(int i = 0; i < arr2D.length; i++) {
            returnArray[i] = arr2D[i][c];
        }

        return returnArray;
    }

    static boolean isLatin(int[][] square) {
        for(int i = 0; i < square[0].length; i++) {
            for(int j = 0; j < square[0].length; j++) {
                if((square[0][i] == square[0][j]) && (i != j)) {
                    return false;
                }
            }
            for(int k = 1; k < square.length; k++) {
                for(int j = 0; j < square[k].length; j++) {
                    if(square[0][i] == square[k][j]) {
                        for(int i = 0)
                    }
                }
            }
        }
    }

}
