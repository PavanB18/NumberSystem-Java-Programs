package numberSystem;

import java.util.Scanner;

public class GreatestOf3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Eneter the 2 numbers");
		 int num1= sc.nextInt();
		 int num2=sc.nextInt();
		 int num3=sc.nextInt();
		 
		 if(num1 > num2 && num1> num3) {
			 System.out.println(num1+" is Greater");
		 }else if ( num2 > num1 && num2 > num3) {
			 System.out.println(num2+" is Greater");
		 }else {
			 System.out.println(num3+" is Greater");
		 }
		 sc.close();
	}

}
