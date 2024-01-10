package numberSystem;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int res = perfectNo(n);
		
		if( res == n) {
			System.out.println(n+" is a Perfect Number.");
		}else {
			System.out.println(n+" not a Perfect Number.");
		}
		sc.close();
	}
	public static int perfectNo(int n) {
		 int sum = 0;
		 for(int i=1; i<n; i++) {
			 if(n % i ==0) {
				 sum = sum + i;
			 }
		 }
		 
		return sum;
	}

}
