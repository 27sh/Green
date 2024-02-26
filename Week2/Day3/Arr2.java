package day03;

public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int m = 3;
		int cnt = 1;
		
		int[][] arr = new int[i][m];
	
		for(int k = 0; k < i; k++) {
			for(int w = 0; w < m; w++) {
				arr[k][w] = cnt;
				cnt++;
				System.out.print(arr[k][w] + " ");
			}
			System.out.println();
		}
		
	}
	

}
