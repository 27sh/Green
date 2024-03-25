package diary;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DiaryContents {
	int i = 0;
	Scanner sc = new Scanner(System.in);
	int inputData;
	
	public void showCon() {
		System.out.println();
		
		System.out.println("1. 일기 쓰기");
		System.out.println("2. 일기 목록 보기");
		System.out.println("3. 종료하기");
		
		System.out.println();
		
		inputData = sc.nextInt();
	}
	
	public void showDiary() throws IOException {
		String path = "C:/Temp/diary/";
		File d = new File(path);
		
		if(!d.exists() || !d.isDirectory()) {
			System.out.println(path+ "는(은) 없는 디렉토리입니다.");
		}
		else {
			File[] files = d.listFiles();
			
			for(; i<files.length; i++) {
				System.out.println(i+1 +":"+ files[i].getName());
			}
			
			System.out.println();
			System.out.println(">> 메뉴로 돌아가기 (0번)");
			System.out.println(">> 일기 읽기 (해당하는 번호를 눌러주세요)");
			
			int inputData = sc.nextInt();
			
			if(inputData != 0) {
				PrintDiary pd = new PrintDiary();
				
				System.out.println("제목 : " +files[inputData - 1].getName());
				System.out.println();
				pd.print(files[inputData - 1].getAbsolutePath());
			}
			
			i = 0;
		}
		

	}
}
