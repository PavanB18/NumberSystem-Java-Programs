package NumberSystem;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	int lcm=lcm2(num1,num2);
	System.out.println(lcm);
	
	}
	//1.method
	public static int lcm(int a, int b) {
		int res=Math.max(a, b);
		while(true) {
			if(res%a ==0 && res%b ==0) {
				return res;
			}
			res++;
		}
	}
	//2.method
	static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}


static int lcm2(int a, int b) {
	return (a*b)/gcd(a,b);
}
}
