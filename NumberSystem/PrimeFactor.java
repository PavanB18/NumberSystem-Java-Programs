package NumberSystem;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		//primeFactor(num1);
		printPrimeFactor(num1);
	}
	//1.method
	public static boolean isPrime(int n) {
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

    public static void primeFactor(int n) {
    	for(int i=2; i<=n; i++) {
    		if(isPrime(i)) {
    			int x=i;
    			while(n % x == 0) {
    				System.out.println(i);
    				x=x*i;
    			}
    		}
    	}
    }
    //2. method
    public static void printPrimeFactor(int n) {
    	if(n<=1) {
    		
    	}
    	for(int i=2; i*i<=n; i++) {
    		while(n%i==0) {
    			System.out.println(i);
    			n=n/i;
    		}
    	}
    	if(n>1) {
    		System.out.println(n);
    	}
    }
}
