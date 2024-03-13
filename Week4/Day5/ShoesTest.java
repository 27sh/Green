package project2;

import java.util.Scanner;

public class ShoesTest {
	
	public static void main(String[] args) throws InterruptedException {
		UI ui = new UI();
		
		Store st = new Store();
		Release re = new Release();
		Stock ck = new Stock();
		
		int inputData;
		
		Scanner sc = new Scanner(System.in);
		
		ui.main();
		
		int flag = 0;
		
		while(flag == 0) {
			ui.menu();
			
			System.out.print("Input Number >> ");
			
			inputData = sc.nextInt();
			
			switch(inputData) {
			case 1 : st.store();
				Thread.sleep(1000);
				break;
			case 2 : re.release();
				Thread.sleep(1000);
				break;
			case 3 : ck.stock();
				Thread.sleep(1000);
				break;
			case 4 : flag = 1;
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("올바르지 않은 입력입니다.");
				System.out.println();
			}	
		}	

	}
}

/*
1. 수량카운트다운
2. 재고 확인
*/
