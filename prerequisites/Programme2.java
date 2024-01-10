package prerequisites;

import java.util.Scanner;

// taking user input 

public class Programme2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the 2 numbers");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int sum = a+b;
		System.out.println("Sum of 2 numbers = "+sum);
		sc.close();
	}

}
