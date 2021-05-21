
public class RecursionAlgs {

    public static void main(String[] args) {
	System.out.println(factorial(5));
	System.out.println(fibonacci(10));
	System.out.println(gcf(2, 4));
    }

    static int factorial(int n) {

	if((n == 0) || (n == 1)) {
	    return 1;
	} else {
	    return n * factorial(n - 1);
	}
    }

    static int fibonacci(int n) {
	if(n == 1) {
	    return 1;
	} else {
	    return n + fibonacci(n - 1);
	}
    }

    static int gcf(int x, int y) {
	if(y == 0) {
	    return x;
	} else {
	    return gcf(y, x % y);
	}
    }

}
