package numberSystem;

import java.util.Scanner;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Natural upto where sum have to find");
		int n=sc.nextInt();
		int res = sumNaturalNo(n);
		System.out.println("Sum of Natural No = "+res);
		sc.close();
	}
	public static int sumNaturalNo(int n) {
		int sum =0;
		for(int i=1; i<=n; i++) {
			sum +=i; 
		}
		
		return sum;
	}

}
