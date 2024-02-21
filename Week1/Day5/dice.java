package day01;

import java.util.Random;

public class dice {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] arr = {0, 0, 0, 0, 0, 0};
		
		for(int i = 0; i < 100; i++) {
			int rdNum = rd.nextInt(6) + 1;
			
			if(rdNum == 1) arr[0]++;
			if(rdNum == 2) arr[1]++;
			if(rdNum == 3) arr[2]++;
			if(rdNum == 4) arr[3]++;
			if(rdNum == 5) arr[4]++;
			if(rdNum == 6) arr[5]++;
		}
	
		System.out.println("주사위 값 1이 나온 횟수 : " + arr[0]);
		System.out.println("주사위 값 2가 나온 횟수 : " + arr[1]);
		System.out.println("주사위 값 3이 나온 횟수 : " + arr[2]);
		System.out.println("주사위 값 4가 나온 횟수 : " + arr[3]);
		System.out.println("주사위 값 5가 나온 횟수 : " + arr[4]);
		System.out.println("주사위 값 6이 나온 횟수 : " + arr[5]);
		
		//System.out.println(arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5]); //확인용
	}
}
