package diary;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintDiary {
	public void print(String n) throws IOException {
		FileReader fr = new FileReader(n);
		
		int ch;
		while((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		
		System.out.println();
		System.out.println(">> 일기 삭제 (0번)");
		System.out.println(">> 목록으로 돌아가기");
		
		Scanner sc = new Scanner(System.in);
		int inputData = sc.nextInt();
		
		if(inputData == 0) {
			delete(n);
		}
	}
	
	public void delete(String n) {
		File file = new File(n);
		
		if(file.exists()) {
			file.delete();
			System.out.println("파일이 삭제되었습니다.");
		}
		else System.out.println("파일이 존재하지 않습니다.");
	}
}
