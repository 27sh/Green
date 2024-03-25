package diary;

import java.util.Scanner;

public class DiaryTest {

	public static void main(String[] args) throws Exception {
		DiaryContents dc = new DiaryContents();
		DiaryWriter dw = new DiaryWriter();
		PrintDiary pd = new PrintDiary();
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		dc.showCon();
		
		while(i == 0) {
			switch(dc.inputData) {
			case 1 : dw.writer();
				dc.showCon();
				dc.inputData = sc.nextInt();
				break;
			case 2 : dc.showDiary();
				dc.showCon();
				break;
			case 3 : System.out.println("프로그램을 종료합니다.");
					i = 1;
				break;
			default : System.out.println("올바르지 않은 입력입니다.");
				break;
			}	
		}
		
	
		
	}

}
