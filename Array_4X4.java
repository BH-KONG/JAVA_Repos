
public class Array_4X4 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = (int)(Math.random()*100);
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
