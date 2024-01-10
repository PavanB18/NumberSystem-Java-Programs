package numberSystem;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no to find fibonacci series upto");
		int num = sc.nextInt();
	    series(num);
	    sc.close();
		
	}
	public static void series(int n) {
		int num1=0, num2=1;
		if(n == 1) {
			System.out.println(num1);
		}else if (n==2) {
			System.out.println(num1+" "+num2);
		}else {
			System.out.print(num1+" "+num2+" ");
			for(int i=3; i<=n; i++) {
			  int num3 = num1+num2;
			  System.out.print(num3+" ");
			  num1=num2;
			  num2=num3;
			}
		}
	}

}
