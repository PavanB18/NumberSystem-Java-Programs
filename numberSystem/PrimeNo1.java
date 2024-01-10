package numberSystem;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the to check wheather it is prime or not");
		 int num=sc.nextInt();
		 boolean res = isPrime(num);
		 if(res==true) {
		 System.out.println(num+" is Prime.");
		 }else {
			 System.out.println(num+" is not Prime.");
		 }
		 sc.close();
		 
	}
	
	public static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}else if(n==2) {
			return true;
		}else {
			for(int i=2; i<n; i++) {
				if(n%i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
