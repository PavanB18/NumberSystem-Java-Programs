package numberSystem;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr No to be rverse");
		int num = sc.nextInt();
		int res= reverseNum(num);
		System.out.println("reverse No : "+res);
		
		sc.close();
	}
	public static int reverseNum(int num) {
		int rev=0;
		int temp=num;
		while(temp != 0) {
			int ld=temp%10;
			rev = rev*10+ld;
			temp = temp/10;
		}
		return rev;
	}

}
