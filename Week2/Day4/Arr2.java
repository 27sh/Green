package day04;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[5][5];
		int cnt = 1;
		
		for(int i =  0; i < 5; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < 5; j++) {
					arr[i][j] = cnt;
					cnt++;
				}
			}
			else {
				for(int j = 4; j >= 0; j--) {
					arr[i][j] = cnt;
					cnt++;
			}
		}
	}
										
			for(int i =  0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}

}
