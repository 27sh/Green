package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import vo.Member;

public class Insert {

	public void insert() {
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String user = "root";
		String pw = "1234";
		String query = "insert into tbl_member values (null, ?, ?, ?, ?)";
		
		System.out.println("-------------------");
		System.out.println("    멤버 정보 등록    ");
		System.out.println("-------------------");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int flag = 0;
		
		ArrayList<Member> list = new ArrayList<>();
		
		while(true) {
			if(flag == 1) {
				System.out.println("종료되었습니다.");
				break;
			}
			else {
				Member m = new Member();
				
				String name;
				System.out.print("이름을 입력하세요 >> ");
				name = sc.next();
				m.setName(name);
				
				System.out.print("전화 번호를 입력하세요 >> ");
				String tel;
				tel = sc.next();
				m.setTel(tel);
				
				System.out.print("성별을 입력하세요 >> ");
				String gender;
				gender = sc.next();
				m.setGender(gender);
				
				System.out.print("나이를 입력하세요 >> ");
				int age;
				age = sc.nextInt();
				m.setAge(age);

				list.add(m);
								
				// 1. DB 접속 (주소, 아이디, 패스워드, 포트번호, db명)
				try {
					Class.forName("org.mariadb.jdbc.Driver");
					Connection conn = DriverManager.getConnection(url, user, pw);
					// 2. Query 작성
					PreparedStatement pstmt = conn.prepareStatement(query);
					pstmt.setString(1, name);
					pstmt.setString(2, tel);
					pstmt.setString(3, gender);
					pstmt.setInt(4, age);
					
					pstmt.executeUpdate();
					
					System.out.println("[ 이름 : "+m.getName()+", 전화번호 : "+m.getTel()+", 성별 : "+m.getGender()+", 나이 : "+m.getAge()+"] 가 추가되었습니다.");
					System.out.println("-------------------");
					System.out.println("계속 추가 하시겠습니까?");
					System.out.println("0 : 계속 | 1 : 취소");
					
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				flag = sc.nextInt();
			}
		}
		
		// 3. Query 실행
		
		// 4. 결과 자료 받기
	}

}
