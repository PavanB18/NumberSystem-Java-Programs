package NumberSystem;

import java.util.Scanner;

public class PrintAllDivisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		printDivisors2(num);
	}
	//1.method
	public static void printDivisors1(int n) {
		for(int i=1; i<=n; i++) {
			if(n%i ==0) {
				System.out.println(i);
			}
		}
	}
	//2.method
	public static void printDivisors2(int n) {
		int i;
		for( i=1; i*i<=n; i++) {
			if(n%i ==0) {
				System.out.println(i);
			}
			for(; i>=1; i--) {
				if(n%i==0) {
					System.out.println(n/i);
				}
			}
		}
	}

}
