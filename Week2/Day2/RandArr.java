package day02;

import java.util.Random;

public class RandArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		int[] a = new int[7];
		int[] b = new int[7];
		int[] c = new int[7];
		
		int j = 0, k = 0;
		
		for(int i = 0; i < 7; i++) {
			int rdNum = rd.nextInt(10) + 1;
			
			a[i] = rdNum;
			//System.out.println(a[i]);
		} // 랜덤 수로 a 배열 채우기
		
		for(int i = 0; i < 7; i++) {
			if(a[i] % 2 == 0) {
				b[j] = a[i];
				j++;
			}
			else {
				c[k] = a[i];
				k++;
			}
		}
		
		System.out.print("B 배열 : ");
		
		for(int i = 0; i < 7; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("C 배열 : ");
		
		for(int i = 0; i < 7; i++) {
			System.out.print(c[i]+ " ");
		}
		
	}

}
