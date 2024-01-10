package prerequisites;

import java.util.Scanner;

public class Programme5 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter any no between 1 to 4");
	      int num= sc.nextInt();
	      if(num == 1) {
	      System.out.println("You Enetred no == 1");
	      }else if (num == 2) {
	      System.out.println("You Enetred no == 2");
	      }else if(num == 3) {
	      System.out.println("You Enetred no == 3");
	      }else if(num ==4) {
	      System.out.println("You Enetred no == 4");
	      }else {
	    	  System.out.println("You haven't Entered no bet 1 to 4.");
	      }
	      sc.close();
	}

}
