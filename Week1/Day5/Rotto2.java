package day01;

import java.util.Random;

public class Rotto2 {

	public static void main(String[] args) {

		Random rd = new Random();
		
		int[] arr = new int[45];
		int[] rotto = new int [6];
		
		for(int i = 0; i < 45; i++) {
			arr[i] = i + 1; // 1~45의 수를 배열에 저장
		}
		
		//--------------------------------------------------------
		
		int i = 0;
		int rdNum = rd.nextInt(45); //랜덤한 수를 뽑기
		
		while(i < 6) {
			if(arr[rdNum] == 0) {
				rdNum = rd.nextInt(45);
			}
			else {
				rotto[i] = arr[rdNum];
				arr[rdNum] = 0;
				i++;
			}
		}
		
		System.out.printf("로또 번호 :");
		
		for(int j = 0; j < 6; j++) {
			System.out.printf(" [%d] ", rotto[j]);
		}
	}

}
