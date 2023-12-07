package NumberSystem;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=countDigit(num);
		System.out.println(res);

	}
	
	public static int countDigit(int n) {
		int count=0;
		while(n !=0) {
			n = n/10;
			count++;
		}
		return count;
	}

}
