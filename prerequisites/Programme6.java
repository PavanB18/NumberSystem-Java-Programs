package prerequisites;

import java.util.Scanner;

public class Programme6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr no between 1 to 4.");
		int num = sc.nextInt();
		switch(num){
		case 1:
			System.out.println("You entered no == 1.");
			break;
		case 2:
			System.out.println("You entered no == 2.");
			break;
		case 3:
			System.out.println("You entered no == 3.");
			break;
		case 4:
			System.out.println("You entered no == 4.");
			break;
		default :
			System.out.println("Read Message Properly");
		}
		sc.close();
	}

}
