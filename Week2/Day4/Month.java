package day04;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("태어난 달을 입력해주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		switch(input) {
			case 1 : System.out.println("1월의 탄생석은 가넷입니다.");
				break;
			case 2 : System.out.println("2월의 탄생석은 자수정입니다.");
				break;
			case 3 : System.out.println("3월의 탄생석은 아쿠아마린입니다.");
				break;
			case 4 : System.out.println("4월의 탄생석은 다이아몬드입니다.");
				break;
			case 5 : System.out.println("5월의 탄생석은 에메랄드입니다.");
				break;
			case 6 : System.out.println("6월의 탄생석은 진주입니다.");
				break;
			case 7 : System.out.println("7월의 탄생석은 루비입니다.");
				break;
			case 8 : System.out.println("8월의 탄생석은 페리도트입니다.");
				break;
			case 9 : System.out.println("9월의 탄생석은 사파이어입니다.");
				break;
			case 10 : System.out.println("10월의 탄생석은 오팔입니다.");
				break;
			case 11 : System.out.println("11월의 탄생석은 토파즈입니다.");
				break;
			case 12 : System.out.println("12월의 탄생석은 터키석입니다.");
				break;
			default : System.out.println("올바르지 않은 입력입니다.");
		}
	}

}
