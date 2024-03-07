package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public void delete() {
		System.out.println("-------------------");
		System.out.println("    멤버 정보 삭제    ");
		System.out.println("-------------------");
		System.out.println();
		
		// TODO Auto-generated method stub
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String user = "root";
		String pw = "1234";
		String query = "DELETE FROM tbl_member WHERE %s = ?";
		
		System.out.print("열을 입력해주세요. : ");
		Scanner sc = new Scanner(System.in);
		String where = sc.next();
		
		// 1. DB 접속 (주소, 아이디, 패스워드, 포트번호, db명)
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			// 2. Query 작성
			System.out.print("삭제할 데이터의 이름을 입력해주세요 : ");
			String m = sc.next();
			
			query = String.format(query, where);
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m);
			pstmt.execute();
			
			System.out.println( m+"이(가) 삭제되었습니다.");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
