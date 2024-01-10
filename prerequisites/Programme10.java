package prerequisites;

public class Programme10 {
// Labeled for loop - in this we give name to the for as outer or inner forloop.
	public static void main(String[] args) {
		outer:for(int i=1; i<=3; i++) {
			System.out.println(i);
			for(int j=1; j<=3; ) {
				System.out.println("Kodnest");
				break outer;
			}
		}
	}

}
