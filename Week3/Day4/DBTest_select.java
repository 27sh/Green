package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String user = "root";
		String pw = "1234";
		String query = ("SELECT * from tbl_member WHERE NAME = 'Tom'");
		
		//1. 접속(드라이버, 커넥션 객체 얻기)
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String gender = rs.getString("gender");
				int age = rs.getInt("age");
				
				System.out.println(name + " : " + tel +" : "+ gender +" : "+age);	
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(".........");
	}

}
