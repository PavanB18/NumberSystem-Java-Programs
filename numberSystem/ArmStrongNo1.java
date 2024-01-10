package numberSystem;

import java.util.Scanner;

public class ArmStrongNo1 {

	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entr the no where we find armstrong no");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            int count = 0;
            for(int i=num1; i<=num2; i++) {
            	int pow = getCount(i);
            	int res = getSum(i, pow);
            	if(i == res) {
            		System.out.print(i+" ");
            		count++;
            	}
            }
            System.out.println("\nTotal No of ArmStrong no are : "+count);
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
