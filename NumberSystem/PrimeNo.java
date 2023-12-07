package NumberSystem;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		boolean prime=isPrime3(num1);
		System.out.println(prime);

	}
	//1.method
	public static boolean isPrime1(int n) {
		
		for(int i=2; i<=n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
//2. method
	
public static boolean isPrime2(int n) {
		
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

//3.
public static boolean isPrime3(int n) {
	if(n==1) {
		return false;
	}
	if(n==2 || n== 3) {
		return true;
	}
	if(n %2 ==0 || n%3==0) {
		return false;
	}
	for(int i=5; i*i<=n; i+=6) {
		if(n%i==0 || n%(i+2)==0) {
			return false;
		}
	}
	
	return true;
}

}
