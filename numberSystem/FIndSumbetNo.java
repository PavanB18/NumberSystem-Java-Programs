package numberSystem;

import java.util.Scanner;

public class FIndSumbetNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no's bet range to find sum");
		int a = sc.nextInt();
		int b=sc.nextInt();
		int res = findSum(a,b);
		System.out.println("Sum between 2 numbers : "+res);
		
		sc.close();
	}
	public static int findSum(int a, int b) {
		int sum=0;
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		return sum;
	}

}
