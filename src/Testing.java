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

	public int mystery5(int x, int y) {
	    if(x < 0)
		return -mystery5(-x,y);
	    else if (y < 0)
		return -mystery5(x,-y);
	    else if(x == 0 && y == 0)
		return 0;
	    else
		return 100*mystery5(x/10,y/10) + 10*(x%10) + y%10;
	}

	// Practice #3
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

	// Quiz Questions
	// 8
	public void mysteria(int n) {
	    if (n > 2)
		mysteria (n % 5);
	    System.out.println((n / 4) + " ");
	}

	// 7
	public void mystery7(int x, int y) {
	    if(y == 1)
		System.out.print(x);
	    else {
		System.out.print(x * y + ",");
		mystery7(x, y - 1);
		System.out.print("," + x * y);
	    }
	}

	//6
	public void mystery6(int a, int b) {
	    System.out.print(a + " ");
	    if(a <= b)
		mystery6(a + 4, b - 1);
	}

	//5
	public int mysteria5(int x, int y) {
	    if (x < 0)
		return -mysteria5(-x,y);
	    else if(y < 0)
		return -mysteria5(x,-y);
	    else if(x == 0 && y == 0)
		return 0;
	    else
		return 100 * mysteria5(x / 10, y / 10) + 10 * (x % 10) + y % 10;
		
	}

	//4
	public int mysteria4(int n) {
	    if(n < 0)
		return mysteria4(-n);
	    else if (n < 10)
		return n;
	    else
		return n % 10 + mysteria4(n / 10);
	}

	//3
	public int mysteria3(int n) {
	    if (n < 0)
		return -mystery3(-n);
	    else if (n < 10)
		return n;
	    else
		return mystery3(n / 10 + n % 10);
	}

	//2
	public int mysterySum(int a) {
	    if (a == 1)
		return 6;
	    else
		return 6 + mysterySum(a-1);
	}

	//1
	public int mystery1(int x, int y) {
	    if (x < y)
		return x;
	    else
		return mystery1(x-y,y);
	}
	    
    }

    public static void main(String[] args) {

		Recursion test = new Recursion();

		// System.out.println(test.mystery3(-479));
		// System.out.println(test.mystery4(3052));
		/*int[] array = {2,4,6};
		  System.out.println(test.sum(array,3));*/
		//System.out.println(test.filter("papaya","pa"));
		//test.mystery(0,16);
		//System.out.println(test.getSomething(75)); # Add one for each interval in which it is divided by 2, so 5 would be 2 because 5-2=3 then 3-2=1.
		  //System.out.println(test.mysteries(3));
		  //System.out.println(test.mystery5(5,7));


		// Quiz Questions: #8 to #1 in descending order
		//test.mysteria(41);
		//test.mystery7(2,4);
		//test.mystery6(2,14);
		//System.out.println(test.mysteria5(212,349));
		//System.out.println(test.mysteria4(5178));
		//System.out.println(test.mysteria3(-295));
		//System.out.println(test.mysterySum(5));
		//System.out.println(test.mystery1(6,13));
		


    }
    
}
