import java.util.Scanner;

public class Array_2D {
	public static void main(String[] args) {
		Scanner myscn = new Scanner(System.in);
		int size;
		int[][] arr;
		
		System.out.print("Size : ");
		size=myscn.nextInt();
		
		arr= new int[size][size];

		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				arr[i][j] = (int)(Math.random()*100);
				
				if(i!=0 && j!=0) {
					for(int x=0;x<=i;x++) {
						for(int y=0; y<=j; y++) {
							if(arr[x][y]==arr[i][j])
								j--;
						}
					}
				}
			}
		}
		
		
		for(int i=0;i<size;i++) {
			for(int j=0; j<size; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		myscn.close();
	}
}
