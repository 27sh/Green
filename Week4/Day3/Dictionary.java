package exception;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dictionary {

	static HashMap<String, String> map = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		map.put("개", "DOG");
		map.put("고양이", "CAT");
		map.put("원숭이", "MONKEY");
		map.put("호랑이", "TIGER");
		map.put("사자", "LION");
		
		
		int flag = 0;
		
		while(flag == 0) {
			menu();
			
			switch(sc.nextInt()) {
			case 1 : input();	
				break;
			case 2 : search();
				break;
			case 3 : delete();
				break;
			case 4 : flag = 1;
				System.out.println("프로그램을 종료합니다.");
				break;
			default : System.out.println("올바르지 않은 입력입니다.");
				break;
			}	
		}
		
		
	}
	
	public static void menu() {
		System.out.println("-----------");
		System.out.println("   단어장    ");
		System.out.println("-----------");
		
		System.out.println();
		
		System.out.println("할 일을 선택해주세요.");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 조회");
		System.out.println("3. 단어 삭제");
		System.out.println("4. 프로그램 종료");
	}
	
	public static void search() {
		System.out.println("- 검색 -");
		System.out.println("1. 한글로 검색");
		System.out.println("2. 영어로 검색");
		
		try {
			int choose = sc.nextInt();
			
			if(choose == 1) {
				System.out.println("검색할 단어를 입력하세요 >> ");
				String inputData = sc.next();
				System.out.println(map.get(inputData));		
			}
			else if(choose == 2) {
				System.out.println("검색할 단어를 입력하세요 >> ");
				String inputData = sc.next();
				
				for(String key : map.keySet()) {
					if(map.get(key).equals(inputData.toUpperCase())) {
						System.out.println(key);
					}
				}
			}
		}
		catch(InputMismatchException e) {
			System.err.println("숫자를 입력해주세요");
		}
		finally {
			
		}
		
	}
	

	public static void input() {
		System.out.println("등록하려는 단어의 한글을 입력해주세요 >> ");
		String v = sc.next();
		System.out.println("해당 단어의 영어를 입력해주세요 >> ");
		String k = sc.next();
		
		map.put(v, k);
	}
	
	public static void delete() {
		System.out.println("삭제하려는 단어를 입력해주세요 : ");
		String inputData = sc.next();
		
		map.remove(inputData);
		
		System.out.println("삭제가 완료되었습니다.");
	}

}
