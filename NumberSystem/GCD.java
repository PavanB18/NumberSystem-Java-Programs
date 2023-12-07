package NumberSystem;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int res=gcd2(num1,num2);
		System.out.println(res);
		
	}
	//1.method
	public static int gcd1(int a, int b) {
		int res=Math.min(a, b);
		
		while(res>0) {
			if(a%res ==0 && b% res==0) {
				break;
			}
			res--;
		}
		return res;
	}
   // 2. method
	public static int gcd2(int a, int b) {
		while(a != b) {
			if(a>b) {
				a-=b;
			}else {
				b-=a;
			}
		}
		return a;
	}
}
