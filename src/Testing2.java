public class Testing2 {

    public static class stuff{

        public int sumNums(int[] nums, int startingIndex) {
		    if (startingIndex == nums.length - 1)
			    return nums[startingIndex];
		    else
                return nums[startingIndex] + sumNums(nums, startingIndex + 1);
	    }

        public int countEvens(int[] nums, int startingIndex) {
            if(startingIndex == nums.length - 1)
                if((nums[startingIndex] % 2) == 0)
                    return 1;
                else
                    return 0;
            else
                if((nums[startingIndex] % 2) == 0)
                    return 1 + countEvens(nums, startingIndex + 1);
                else
                    return countEvens(nums, startingIndex + 1);
        }

        

    }

    public static void main(String[] args) {

        int[] values = {6, 2, 11, 4, 5}; // 6 evens

        stuff thing = new stuff();

        // System.out.println(thing.sumNums(values, 0));
        System.out.println(thing.countEvens(values, 0));
    }
    
}
