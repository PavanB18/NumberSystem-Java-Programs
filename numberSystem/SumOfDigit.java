package numberSystem;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr number to find sumofDigit");
		int num=sc.nextInt();
		int res=sumOfDigit(num);
		System.out.println("Sum of Digit "+res);
		sc.close();
		
	}
	public static int sumOfDigit(int num) {
		int sum=0, ld=0;
		while(num !=0) {
			ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		return sum;
	}

}
