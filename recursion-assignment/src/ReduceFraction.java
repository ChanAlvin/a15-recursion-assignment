public class ReduceFraction {
	public static void main(String[] args) {
		int nu = 128;
		int de = 64;
		int nuReduced = nu;
		int deReduced = de;
		
		int factor = gcd(nu, de);
		nuReduced /= factor;
		deReduced /= factor;
		
		if (deReduced == 1) {
			System.out.println(nu + "/" + de + " in lowest terms is " + nuReduced);
		} else {
			System.out.println(nu + "/" + de + " in lowest terms is " + nuReduced + "/" + deReduced);
		}
	}
	
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
}
