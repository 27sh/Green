package day04;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("점수를 입력해주세요");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		int s = score / 10;
		
		switch(s) {
		case 10 : System.out.println("A+ 입니다.");
			break;
		case 9 : System.out.println("A 입니다.");
			break;
		case 8 : System.out.println("B 입니다."); // 100~90 이면 A 90 ~80이면 B 80~70이면 C 70~60이면 D, 외에는 F	
			break;
		case 7 : System.out.println("C 입니다.");
			break;
		case 6 : System.out.println("D 입니다.");
			break;
		default : System.out.println("F 입니다.");
		
		}
	}

}
