package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import vo.Member;

public class input {

	public static void main(String[] args) {
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String user = "root";
		String pw = "1234";

		System.out.println("데이터 추가를 시작하시겠습니까?");
		System.out.println("0 : 시작 | 1 : 취소");
		
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		
		ArrayList<Member> list = new ArrayList<>();
		
		while(true) {
			if(flag == 1) {
				System.out.println("종료되었습니다.");
				break;
			}
			else {
				Member m = new Member();
				
				System.out.println("-------------------");
				System.out.println("    데이터 입력 시작   ");
				System.out.println("-------------------");
				System.out.println();
				
				System.out.print("이름 : ");
				m.setName(sc.next());
				
				System.out.print("전화 번호 : ");
				m.setTel(sc.next());
				
				System.out.print("성별 : ");
				m.setGender(sc.next());
				
				System.out.print("나이 : ");
				m.setAge(sc.nextInt());

				list.add(m);
								
				// 1. DB 접속 (주소, 아이디, 패스워드, 포트번호, db명)
				try {
					String query = "insert into tbl_member4 values ('"+m.getName()+"', '"+m.getTel()+"', '"+m.getGender()+"', "+m.getAge()+")";
					
					Class.forName("org.mariadb.jdbc.Driver");
					Connection conn = DriverManager.getConnection(url, user, pw);
					// 2. Query 작성
					Statement stmt = conn.createStatement();
					stmt.executeUpdate(query);
					
					System.out.println("추가되었습니다.");
					System.out.println("-------------------");
					System.out.println("계속 추가 하시겠습니까?");
					System.out.println("0 : 계속 | 1 : 취소");
					
					flag = sc.nextInt();
							
					
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		// 3. Query 실행
		
		// 4. 결과 자료 받기
	}

}
package vo;

public class Member {
	private String name;
	private String tel;
	private String gender;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " +name+ ", 번호 : " +tel+ ", 성별 : " +gender+ ", 나이 : " +age+ "\n";
	}
	
}
