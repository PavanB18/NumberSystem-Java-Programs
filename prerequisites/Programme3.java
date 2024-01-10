package prerequisites;

import java.util.Scanner;

public class Programme3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the 2 No's");
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c =a+b;
		System.out.println("Sum of No's = "+c);
		
		int d = a-b;
		System.out.println("Difference of No's = "+d);
		
		int e = a*b;
		System.out.println("Multiflication of No's = "+e);
		
		int f = a/b;
		System.out.println("Division of No's = "+f);
		sc.close();
		
	}

}
