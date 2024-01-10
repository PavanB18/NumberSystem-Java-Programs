package numberSystem;

import java.util.Scanner;

public class GreatestOf2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Eneter the 2 numbers");
		 int num1= sc.nextInt();
		 int num2=sc.nextInt();
		 if(num1>num2) {
			 System.out.println(num1 +" is Greater");
		 }else {
			 System.out.println(num2+" is Greater");
		 }
		 sc.close();
	}

}
