package day01;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] arr = {0, 0, 0, 0, 0, 0};
		
		for(int i = 0; i < 100; i++) {
			int rdNum = rd.nextInt(6) + 1;
			
			for(int j = 0; j < 6; j++) {
				if(rdNum == j + 1) arr[j]++;
			}
		}
		
		for(int k = 0; k < 6; k++) {
			System.out.println("주사위 값 " + (k+1) + "이 나온 횟수 : " + arr[k]);
		}
		
		System.out.println(arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5]); //확인용
	}
}
