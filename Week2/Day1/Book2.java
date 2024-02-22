package day01;

import java.util.Scanner;

public class time {
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int[] book = new int [10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println("예약 방법 : 원하는 객실의 넘버를 입력해주세요. 예약 취소를 원한다면 한 번 더 입력해주세요.");

		System.out.println("시작하려면 1을, 종료하려면 0을 입력하세요.");
		
		UI(arr, book);
		
		Scanner flag = new Scanner(System.in);
		int f;
		f = flag.nextInt();
				
		while (f == 1) {

			Scanner sc = new Scanner(System.in);
			
			int inputData;
			
			System.out.print("Input Number >> ");
			inputData = sc.nextInt();	
			
			
			for(int i = 0; i < 10; i++) {
				if(inputData == arr[i]) {
					if(book[i] == 0) book[i] = 1;
					else book[i] = 0;
				}
			}
			UI(arr, book);
			
			System.out.println("계속하려면 1을, 종료하려면 0을 입력하세요.");
			f = flag.nextInt();
		}
		
		System.out.println("예약이 완료되었습니다.");
		
	}
	
	
	
	public static void UI(int[] arr, int[] book) {
		
		System.out.printf("\n");

		System.out.println("*예약 현황*");
		
		System.out.printf("\n");

		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
		System.out.printf("\n");
		System.out.printf("---------------------\n");


		for(int i = 0; i < 10; i++) {
			System.out.printf("%d ", book[i]);
		}	
		System.out.printf("\n");
		System.out.printf("\n");

	}
		
}
  
