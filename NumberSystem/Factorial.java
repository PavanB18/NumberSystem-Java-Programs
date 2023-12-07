package NumberSystem;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long num=sc.nextLong();
		long factorial=fact(num);
		System.out.println(factorial);
		
	}
	public static long fact(long n) {
		long fact=1;
		for(int i=2; i<=n; i++) {
			fact=fact*i;
		}
		return fact;
	}

}
