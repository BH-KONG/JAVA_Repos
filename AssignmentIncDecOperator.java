
public class AssignmentIncDecOperator {
	static void printAB(int a, int b) {
		System.out.print("a = " + a + " b = " + b + "\n");
	}
	
	public static void main(String[] args) {
		int a = 3, b = 3;
		int d = 3;
		
		a=d++;
		printAB(a,b);
		a=++d;
		printAB(a,b);
		a=d--;
		printAB(a,b);
		a=--d;
		printAB(a,b);
	}
}
