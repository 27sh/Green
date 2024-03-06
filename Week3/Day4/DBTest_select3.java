package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import vo.Member;

public class DBTest_select2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String user = "root";
		String pw = "1234";
		String query = ("SELECT * from tbl_member");

		//1. 접속(드라이버, 커넥션 객체 얻기)
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			ArrayList<Member> list = new ArrayList<>();
			
			while(rs.next()) {
				Member m = new Member();
			
				m.setName(rs.getString("name"));
				m.setTel(rs.getString("tel"));
				m.setGender(rs.getString("gender"));
				m.setAge(rs.getInt("age"));
				
				list.add(m);
			}
			
				System.out.println(list);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(".........");
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
