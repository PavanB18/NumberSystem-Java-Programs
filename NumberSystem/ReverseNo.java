package NumberSystem;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int reversed=revNo(num);
		System.out.println(reversed);
	}
	public static int revNo(int n) {
		int rev=0;
		int temp=n;
		while(temp != 0) {
			int ld=temp%10;
			rev= rev*10+ld;
			temp = temp/10;
		}
		return rev;
	}

}
