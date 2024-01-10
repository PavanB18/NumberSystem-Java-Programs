package numberSystem;

import java.util.Scanner;

public class PowerOfNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the base No");
		int base = sc.nextInt();
		System.out.println("Enetr the Exponent No");
		int ex=sc.nextInt();
		double res=Math.pow(base, ex);
		
		//int pow=exponentOfNo(base,ex);
		System.out.println("Power of Given No : "+res);
		sc.close();
		
		
	}
	public static int exponentOfNo(int base, int ex) {
		int pow=1;
		for(int i=1; i<=ex; i++) {
			pow=pow*base;
		}
		return pow;
	}

}
