import java.util.ArrayList;

public class Fibonacci {
	static int n = 6;
	static int x = 0;
	static int sum = 0;
	static ArrayList<Integer> fib = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		fib.add(1);
		x++;
		fib.add(1);
		x++;
		
		fibber();
		
		System.out.println(fib.get(n - 1));
	}
	
	static void fibber() {
		fib.add(fib.get(x-1) + fib.get(x-2));
		x++;
		
		if (x < n) {
			fibber();
		}
	}
}
