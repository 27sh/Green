package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String user = "root";
		String pw = "1234";
		String query = "DELETE FROM tbl_member WHERE NAME = 'Tom'";
		
		// 1. DB 접속 (주소, 아이디, 패스워드, 포트번호, db명)
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			// 2. Query 작성
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
