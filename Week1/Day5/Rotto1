package day01;

import java.util.Random;

public class Rotto1 {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] arr = {0, 0, 0, 0, 0, 0};
		
		for(int i = 0; i < arr.length; i++) {
			int rdNum = rd.nextInt(45);
			arr[i] = rdNum;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		System.out.printf("로또 번호 :");
		
		for(int i = 0; i < 6; i++) {
			System.out.printf(" [%d] ", arr[i]);
		}
		
	}
		
}
