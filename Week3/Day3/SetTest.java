package list;

import java.util.HashSet;
import java.util.Scanner;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> strSet = new HashSet<>(); //중복데이터 허용x, 순서 의미 없음
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input = sc.nextLine();

			if(strSet.contains(input)) {
				System.out.println("중복된 데이터가 있습니다.");
			}
			else if(input.toLowerCase().equals("quit")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			else {
				strSet.add(input);
				System.out.println("입력이 완료되었습니다.");
			}
		}		
		System.out.println(strSet);
	}

}
