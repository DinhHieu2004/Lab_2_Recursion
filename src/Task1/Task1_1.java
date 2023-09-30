package Task1;

public class Task1_1 {
	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
	public static int getSn1(int n) {
		if (n == 1) {
			return 1;
		} else if (n % 2 == 0) {
			return -n + getSn1(n - 1);
		} else {
			return n + getSn1(n - 1);
		}
	}
	// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
	public static int getSn2(int n) {
		if (n == 1) {
			return 1;
		}
		return getSn2(n - 1) + getFactorial(n);
	}
	
	public static int getFactorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * getFactorial(n - 1);
	}
	
	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n) {
		if (n == 1) {
			return 1;
		}
		return n *n + getSn3(n-1);
	}
	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static double getSn4(int n) {
		if(n==0) {
			return 1;
		}
		return 2*n* denominator(n)+getSn4(n-1);
	}
	public static double denominator(int n) {
		if(n==0) {
			return 1;
		}
		return n*2* denominator(n-1);
	}
	public static void main(String[] args) {
		System.out.println(getSn3(1));
		System.out.println(getSn1(5));
		System.out.println(getSn2(3));
		System.out.println(getSn4(4));
		
	}
}
