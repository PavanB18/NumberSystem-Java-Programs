package numberSystem;

import java.util.Scanner;

public class ArmStrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number");
		int num = sc.nextInt();
		int pow = getCount(num);
		int res = getSum(num,pow);
		if(num == res) {
			System.out.println(num+" is a ArmStrong No.");
		}else {
			System.out.println(num+" not a ArmStrong No.");
		}
		sc.close();
		
	}
	public static int getCount(int num) {
		int count =0;
		while(num != 0) {
			int ld = num%10;
			count++;
			num= num/10;
		}
		return count;
	}
	public static int getSum(int num, int pow) {
		int sum=0;
		if(num == 0) {
			return 0;
		}
		while(num != 0) {
			int ld = num%10;
			int value = (int) Math.pow(ld, pow);
			sum = sum + value;
			num /= 10;
		}
		return sum;
	}

}
