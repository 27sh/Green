package db;

import java.util.Scanner;

import vo.Member;

public class UI {
	private MemberDao_maria dao = new MemberDao_maria();
	
	Scanner sc = new Scanner(System.in);
	
	private void showInfo() {
		System.out.println("----------------------");
		System.out.println("|  게시글 관리 프로그램   |");
		System.out.println("----------------------");
		
		System.out.println();
		
		System.out.println("원하는 업무에 해당하는 번호를 눌러주세요.");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 열람");
		System.out.println("3. 게시글 수정");
		System.out.println("4. 게시글 삭제");
		System.out.println("5. 프로그램 종료");

	}
	
	public void showMenu() throws InterruptedException {
		int flag = 0;
		
		while(flag == 0) {
			showInfo();
			
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1 : regForm();
			Thread.sleep(1000);
				break;
			case 2 : search();
			Thread.sleep(1000);
				break;
			case 3 : update();
			Thread.sleep(1000);
				break;
			case 4 : delete();
			Thread.sleep(1000);
				break;
			case 5 : flag = 1;
				System.out.println("프로그램 종료");
				break;
			default : System.out.println("올바르지 않은 입력입니다.");
			Thread.sleep(1000);	
				break;
			}
		}
	}

	private void delete() {
		System.out.println("----------------------");
		System.out.println("|      게시글 삭제      |");
		System.out.println("----------------------");
		
		System.out.println("삭제하려는 게시글의 번호를 입력해주세요 : ");
		
		int num = sc.nextInt();
		
		dao.delete(num);
		
		System.out.println("*********************");

	}

	private void regForm() {	
		System.out.println("----------------------");
		System.out.println("|      게시글 등록      |");
		System.out.println("----------------------");
		
		System.out.println("Input Title : ");
		String str = sc.nextLine();
		
		String title = sc.nextLine();
		
		System.out.println("Write : ");
		String write = sc.nextLine();
		
		Member m = new Member(title, write);
		
		boolean tf = dao.insert(m);
		if(tf == true) {
			System.out.println("등록되었습니다.");
		}
		else {
			System.out.println("등록 실패");
		}
		
		System.out.println("*********************");

	}
	
	private void search() {
		System.out.println("----------------------");
		System.out.println("|      게시글 열람      |");
		System.out.println("----------------------");
		
		System.out.println("원하는 옵션의 번호를 눌러주세요.");
		System.out.println();
		System.out.println("1. 전체 게시글 열람");
		System.out.println("2. 작성자로 검색");
		System.out.println("3. 게시글 제목으로 검색");
		
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1 : dao.selectAll();
			break;
		case 2 : dao.findByid();
			break;
		case 3 : dao.findByTitle();
			break;
		default : System.out.println("올바르지 않은 입력입니다.");
		
		System.out.println("*********************");

			
		}
	}
	
	private void update() {
		System.out.println("----------------------");
		System.out.println("|      게시글 수정      |");
		System.out.println("----------------------");
		
		dao.update();
		
        System.out.println("데이터 수정이 완료되었습니다.");
        
		System.out.println("*********************");


	}
}
