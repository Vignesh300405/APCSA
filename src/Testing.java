public class Testing {

/// public static class Recursion {
///  
///ublic int mystery3(int n) {
///  	if(n < 0)
///   return -mystery3(-n);
///  	else if(n < 10)
///   return n;
///  	else
///   return mystery3(n/10 + n%10);
///

///ublic int mystery4(int n) {
///if(n < 0)
///    return mystery4(-n);
///else if(n < 10)
///    return n;
///else
///    return n%10 + mystery4(n/10);
///// For example, if n were 3052, the process would be:
///// Go to else, get (3052%10) = 2 and do mystery4(3052/10), which is mystery4(305)
///// Repeat again, with (305%10) = 5 and do mystery4(305/10), which is mystery4(30)
///// Repeat again, with (30%10) = 0 and do mystery4(30/10), which would be mystery4(3)
///// Return n, which would be 3.
///// Finally, do 2 + 5 + 0 + 3 to get 10
///

///ublic int sum(int arr[], int n) {
///if (n == 0)
///	return 0;
///else {
///	int smallResult = sum(arr, n-1);
///	return smallResult + arr[n-1];
///}
///

///blic int mystery5(int x, int y) {
///  if(x < 0)
///eturn -mystery5(-x,y);
///  else if (y < 0)
///eturn -mystery5(x,-y);
///  else if(x == 0 && y == 0)
///eturn 0;
///  else
///eturn 100*mystery5(x/10,y/10) + 10*(x%10) + y%10;
//

/// Practice #3
///blic String smile(int n) {
///  String output = "";
///  if (n == 0)
///eturn output;
///  for(int k=1; k <= n; k++)
///utput += "smile!";
///  smile(n-1);
///  return output;
//

///blic String filter(String str, String pattern) {
///  int pos = str.indexOf(pattern);
///  System.out.println(pos);
///  if(pos == -1)
///eturn str;
///  else
///ystem.out.println(str.substring(0,pos));
///      System.out.println(str.substring(pos + pattern.length()));
///eturn filter(str.substring(0,pos) + str.substring(pos + pattern.length()), pattern);
//
//

///blic void mystery (int a, int b) {
///  System.out.println(a + " ");
///  if(a <= b)
///ystery(a+5,b-1);
//

///blic int getSomething(int value) {
///  if(value < 2)
///eturn 0;
///  else
///eturn 1 + getSomething(value - 2);
//

///blic int mysteries(int n) {

///  if (n < 0)
///eturn 2;
///  else
///eturn mysteries(n - 1) + mysteries(n - 3);
///  
//

/// Quiz Questions
/// 8
///blic void mysteria(int n) {
///  if (n > 2)
///ysteria (n % 5);
///  System.out.println((n / 4) + " ");
//

/// 7
///blic void mystery7(int x, int y) {
///  if(y == 1)
///ystem.out.print(x);
///  else {
///ystem.out.print(x * y + ",");
///ystery7(x, y - 1);
///ystem.out.print("," + x * y);
///  }
//

///6
///blic void mystery6(int a, int b) {
///  System.out.print(a + " ");
///  if(a <= b)
///ystery6(a + 4, b - 1);
//

///5
///blic int mysteria5(int x, int y) {
///  if (x < 0)
///eturn -mysteria5(-x,y);
///  else if(y < 0)
///eturn -mysteria5(x,-y);
///  else if(x == 0 && y == 0)
///eturn 0;
///  else
///eturn 100 * mysteria5(x / 10, y / 10) + 10 * (x % 10) + y % 10;
//
//

///4
///blic int mysteria4(int n) {
///  if(n < 0)
///eturn mysteria4(-n);
///  else if (n < 10)
///eturn n;
///  else
///eturn n % 10 + mysteria4(n / 10);
//

///3
///blic int mysteria3(int n) {
///  if (n < 0)
///eturn -mystery3(-n);
///  else if (n < 10)
///eturn n;
///  else
///eturn mystery3(n / 10 + n % 10);
//

///2
///blic int mysterySum(int a) {
///  if (a == 1)
///eturn 6;
///  else
///eturn 6 + mysterySum(a-1);
//

///1
///blic int mystery1(int x, int y) {
///  if (x < y)
///eturn x;
///  else
///eturn mystery1(x-y,y);
//

	public void question2() {

	String str = "a black cat sat on a table";
	int counter = 0;
	for (int i = 0; i < str.length() - 1; i++) {
		if(str.substring(i, i + 1).equals("a") && !str.substring(i + 1, i + 2).equals("b")) {
			counter++;
		}
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

		// Practice Test 1
		test.question2();
		


    }
    
}
