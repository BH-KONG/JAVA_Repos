import java.util.Scanner;

public class UpNDown {
	public static void main(String[] args) {
		int answer; 
		Scanner myscn = new Scanner(System.in);
		
		while(true) {
			int trying;
			String cont;
			int min=0,max=100;
			int count = 1;
			answer = (int)(Math.random()*100);
			
			System.out.println("Answer is ready. Try it!");
			while(true) {
				System.out.println(min + " ~ " + max);
				System.out.print(count + " >> ");
				trying = myscn.nextInt();
				myscn.nextLine();
				if(trying < answer) {
					System.out.println("Higher~!");
					min = trying;
				}
				else if(trying > answer) {
					System.out.println("Lower!");
					max = trying;
				}
				else {
					System.out.println("Correct!");
					break;
				}
				count++;
			
			}
			System.out.print("Countinue? Y/N: ");
			cont = myscn.nextLine();
			
			if(cont.equals("N")||cont.equals("n")) {
				break;
			}
		}
		
		myscn.close();
	}
}
