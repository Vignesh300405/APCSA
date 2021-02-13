import java.util.ArrayList;

public class testFile {

    public int evens(int[][] array) {  // #2

        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if((array[i][j] % 2) == 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public int average(int[] nums) {   // #5
        int sum = 0;

        for(int i : nums) {
            sum += i;
        }

        return sum / nums.length; 
    }

    public ArrayList<String> removeA(ArrayList<String> names) { // #6

        for(int i = 0; i < names.size(); i++) {
           if(names.get(i).startsWith("a")) {
               names.remove(i);
           } 
        }    

        return names;
    }


}











