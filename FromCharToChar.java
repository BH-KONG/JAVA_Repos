import java.util.Scanner;

public class FromCharToChar {
	public static void main(String[] args) {
		Scanner myscn = new Scanner(System.in);
		String base;
		
		System.out.print("input small char: ");
		// A(0041)~Z(005A) // a(0061)~z(007A);
		base = myscn.nextLine();
		
		char b = base.charAt(0);
		for(char i=b; i>='a'; i--) {
			for(char j='a'; j<=i; j++) {
			System.out.print(j);
			}
			System.out.println();
		}
		myscn.close();
	}
}
