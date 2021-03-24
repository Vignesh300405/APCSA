public class Testing {

    public static class Recursion {
	    
		public int mystery3(int n) {
	    	if(n < 0)
		    return -mystery3(-n);
	    	else if(n < 10)
		    return n;
	    	else
		    return mystery3(n/10 + n%10);
		}

		public int mystery4(int n) {
			if(n < 0)
			    return mystery4(-n);
			else if(n < 10)
			    return n;
			else
			    return n%10 + mystery4(n/10);
			// For example, if n were 3052, the process would be:
			// Go to else, get (3052%10) = 2 and do mystery4(3052/10), which is mystery4(305)
			// Repeat again, with (305%10) = 5 and do mystery4(305/10), which is mystery4(30)
			// Repeat again, with (30%10) = 0 and do mystery4(30/10), which would be mystery4(3)
			// Return n, which would be 3.
			// Finally, do 2 + 5 + 0 + 3 to get 10
		}

		public int sum(int arr[], int n) {
			if (n == 0)
				return 0;
			else {
				int smallResult = sum(arr, n-1);
				return smallResult + arr[n-1];
			}
		}

	public String smile(int n) {
	    String output = "";
	    if (n == 0)
		return output;
	    for(int k=1; k <= n; k++)
		output += "smile!";
	    smile(n-1);
	    return output;
	}

	public String filter(String str, String pattern) {
	    int pos = str.indexOf(pattern);
	    System.out.println(pos);
	    if(pos == -1)
		return str;
	    else
		System.out.println(str.substring(0,pos));
	        System.out.println(str.substring(pos + pattern.length()));
		return filter(str.substring(0,pos) + str.substring(pos + pattern.length()), pattern);
		
	}

	public void mystery (int a, int b) {
	    System.out.println(a + " ");
	    if(a <= b)
		mystery(a+5,b-1);
	}

	public int getSomething(int value) {
	    if(value < 2)
		return 0;
	    else
		return 1 + getSomething(value - 2);
	}

	public int mysteries(int n) {

	    if (n < 0)
		return 2;
	    else
		return mysteries(n - 1) + mysteries(n - 3);
	    
	}
	    
    }

    public static void main(String[] args) {

		Recursion test = new Recursion();

		// System.out.println(test.mystery3(-479));
		// System.out.println(test.mystery4(3052));
		int[] array = {2,4,6};
		  System.out.println(test.sum(array,3));
		//System.out.println(test.filter("papaya","pa"));
		//test.mystery(0,16);
		//System.out.println(test.getSomething(75)); # Add one for each interval in which it is divided by 2, so 5 would be 2 because 5-2=3 then 3-2=1.
		  System.out.println(test.mysteries(3));


    }
    
}
