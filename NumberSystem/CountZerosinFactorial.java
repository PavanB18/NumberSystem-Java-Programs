package NumberSystem;

import java.util.Scanner;

public class CountZerosinFactorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=countTrailZeros(num);
		System.out.println(count);
	}
	//1.Method
	public static int countZeros(int n) {
		int fact=1;
		for(int i=2; i<=n; i++) {
			fact=fact*i;
		}
			int res=0;
			while(fact % 10==0) {
				res++;
				fact/=10;
			}
			return res;
	}
 // 2.method
	public static int countTrailZeros(int n) {
		int res=0;
		for(int i=5; i<=n; i=i*5) {
			res=res+n/i;
		}
		return res;
	}
}
