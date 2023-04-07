import java.util.Scanner;

public class StringCalculator {
	public static void main(String[] args) {
		Scanner myscn = new Scanner(System.in);
		int x,y;
		String oper;
		
		System.out.print(">> ");
		x = myscn.nextInt();
		oper = myscn.next();
		y = myscn.nextInt();
		
//		// if-else
//		if(oper.equals("+")) 
//			System.out.println("A: " + (x+y));
//		else if(oper.equals("-"))
//			System.out.println("A: " + (x-y));
//		else if(oper.equals("*"))
//			System.out.println("A: " + (x*y));
//		else if(oper.equals("/")) {
//			if(y == 0) 
//				System.out.println("Devide Error!");
//			else
//			System.out.println("A: " + (x/y));
//		}
//		else 
//			System.out.println("Wrong Input!");
//		myscn.close();
		
		// switch-case
		switch(oper) {
		case "+": 
			System.out.println("A: " + (x+y));
			break;
		case "-":
			System.out.println("A: " + (x-y));
			break;
		case "*": 
			System.out.println("A: " + (x*y));
			break;
		case "/": 
			if(y == 0) {
				System.out.println("Devide Error!");
				break;
			}
			else {
				System.out.println("A: " + (x/y));
				break;
			}
		default: 
			System.out.println("Wrong Input!");
		}
		myscn.close();
	}
}
