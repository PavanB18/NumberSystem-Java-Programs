package numberSystem;

import java.util.Scanner;

public class Plaindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the No to check Palindrome");
		int num=sc.nextInt();
		palindrome(num);
		sc.close();
		
	}
	public static void palindrome(int num) {
		int rev=0, ld=0;
		int temp=num;
		while(temp !=0) {
			ld=temp%10;
			rev=rev*10+ld;
			temp=temp/10;
		}
		if(rev==num) {
		System.out.println(num+" Is Palindrome");
		}
		else {
			System.out.println(num+" Not a Palindrome");
		}
	}

}
