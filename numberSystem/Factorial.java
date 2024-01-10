package numberSystem;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no to find factorial");
		int n= sc.nextInt();
		
		int res = factorial(n);
		System.out.println(res);
		sc.close();
		
	}
	
	public static int factorial(int n) {
		
		int fact = 1;
		
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		
		return fact;
	}

}
