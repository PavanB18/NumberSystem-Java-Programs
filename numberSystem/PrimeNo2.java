package numberSystem;

import java.util.Scanner;

public class PrimeNo2 {
// print the prime no bet given range
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 no to print prime no");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count=0;
		for(int i=a; i<=b; i++) {
			boolean res=isPrime(i);
			if(res==true) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total Prime No bet Given Range is : "+count);
		sc.close();
		
	}
	
	public static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}else if(n==2) {
			return true;
		}
		else {
			for(int i=2; i<n; i++) {
				if(n%i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
