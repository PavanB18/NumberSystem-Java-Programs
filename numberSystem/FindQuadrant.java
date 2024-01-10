package numberSystem;

import java.util.Scanner;

public class FindQuadrant {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Eneter the values of x & y");
		 int x= sc.nextInt();
		 int y=sc.nextInt();
		 if( x == 0 && y == 0) {
			 System.out.println("Origin");
		 }else if ( x > 0 && y>0) {
			 System.out.println("I Quadrant");
		 }else if(x<0 && y>0) {
			System.out.println("II Quadrant"); 
		 }else if(x<0 && y<0) {
			 System.out.println("III Quadrant");
		 }else if(x>0 && y<0) {
			 System.out.println("IV Quadrant");
		 }else if((x==0 && y>0) || (x==0 && y<0)) {
			 System.out.println("Y-Axix");
		 }else if( (y==0 && x>0) || (y==0 && x<0)) {
			 System.out.println("X-Axix");
		 }
		 sc.close();
	}

}
