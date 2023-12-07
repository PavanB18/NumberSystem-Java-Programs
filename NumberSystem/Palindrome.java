package NumberSystem;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		boolean isPalindrome=isPal(num);
		System.out.println(isPalindrome);
	}
    public static boolean isPal(int n) {
    	
    	int rev=0;
    	int temp=n;
    	
    	while(temp !=0) {
    		int ld=temp%10;
    		rev=rev*10+ld;
    		temp/=10;
    	}
    	
    	return (rev==n);
    }
}
