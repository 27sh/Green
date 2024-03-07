package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Select {

	public void select() {
		System.out.println("-------------------");
		System.out.println("    멤버 정보 열람    ");
		System.out.println("-------------------");
		System.out.println();
		
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String user = "root";
		String pw = "1234";
		String query_all = ("SELECT * from tbl_member");
		
		
		System.out.println("원하시는 옵션을 선택해주세요.");
		System.out.println("0 : 전체 출력 | 1 : 부분 출력");
		
		Scanner sc = new Scanner(System.in);
		int flag = sc.nextInt();
		
				
		//1. 접속(드라이버, 커넥션 객체 얻기)
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement stmt = conn.createStatement();
			
			if(flag == 0) {

				ResultSet rs = stmt.executeQuery(query_all);
				
				while(rs.next()) {
					String name = rs.getString("name");
					String tel = rs.getString("tel");
					String gender = rs.getString("gender");
					int age = rs.getInt("age");
					
					System.out.println(name + " : " + tel +" : "+ gender +" : "+age);	
				}	
			}
			else {
				String query = ("SELECT * from tbl_member WHERE %s = ?");	
				
				System.out.print("출력할 열의 이름 기입 : ");
				String where = sc.next();
				System.out.print("포함할 데이터 기입 : ");
				String data = sc.next();
				
				query = String.format(query, where);
				//System.out.println(query);
				PreparedStatement pstmt = conn.prepareStatement(query);
				pstmt.setString(1, data);
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					String name = rs.getString("name");
					String tel = rs.getString("tel");
					String gender = rs.getString("gender");
					int age = rs.getInt("age");
					
					System.out.println(name + " : " + tel +" : "+ gender +" : "+age);	
				}
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
