import java.util.Scanner;

public class RectIsContact {
	static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1 && x<=rectx2)&&(y>=recty1 && y<=recty2))
			return true;
		else return false;
	}

	public static void main(String[] args) {
		Scanner myscn = new Scanner(System.in);
		int x1,y1,x2,y2;
		
		System.out.print("Rect x1, y1: ");
		x1=myscn.nextInt();
		y1=myscn.nextInt();
		System.out.print("Rect x2, y2: ");
		x2=myscn.nextInt();
		y2=myscn.nextInt();
		
		for(int X=x1; X<=x2; X++) {
			for(int Y=y1; Y<=y2; Y++) {
				if(inRect(X,Y,100,100,200,200)) {
					System.out.println("Yes");
					break;
				}
			}
		}

		myscn.close();
	}
}
