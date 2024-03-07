package db;

import java.util.Scanner;

public class UI {
	static int inputData;

	public static void ui() {
		System.out.println();
		System.out.println();

		System.out.println("*********************");
		System.out.println("   멤버 관리 프로그램    ");
		System.out.println("*********************");
		
		System.out.println();

		System.out.println("할 일을 선택하세요.");
		System.out.println();
		System.out.println("1. 멤버 정보 열람");
		System.out.println("2. 멤버 정보 등록");
		System.out.println("3. 멤버 정보 수정");
		System.out.println("4. 멤버 정보 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number >> ");
		inputData = sc.nextInt();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Select se = new Select();
		Insert in = new Insert();
		Update up = new Update();
		Delete del = new Delete();
		
		int flag = 0;
		
		while(flag == 0) {
			ui();
			
			switch(inputData) {
			case 1 : se.select();
				Thread.sleep(1000);
				break;
			case 2 : in.insert();
				Thread.sleep(1000);
				break;
			case 3 : up.update();
				Thread.sleep(1000);
				break;
			case 4 : del.delete();
				Thread.sleep(1000);
				break;
			case 5 : flag = 1;
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("올바르지 않은 입력입니다.");
				System.out.println();
			}	
		}
	}

}
