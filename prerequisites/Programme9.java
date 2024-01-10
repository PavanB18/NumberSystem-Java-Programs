package prerequisites;

public class Programme9 {

	public static void main(String[] args) {
		 for(int i=1; i<=3; i++) {
			 System.out.println(i);
			 for(int j=1; j<=3; j++) {
				 if(j==2) {
					 break;
				 }
				 System.out.println(j);
				 System.out.println("Kodnest");
			 }
		 }
	}

}
