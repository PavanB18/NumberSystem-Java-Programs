package prerequisites;

import java.util.Scanner;

public class Programme4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number");
		int num=sc.nextInt();
		
		if(num==1) {
			System.out.println("You have pressed no 1.");
		}
		else {
			System.out.println("You haven't pressed no 1.");
		}
		sc.close();
	}

}
