package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
			
			while(rs.next()) {
				Member m2 = new Member(rs.getString("name"), rs.getString("tel"), rs.getString("gender"), rs.getInt("age"));
			
				System.out.println(m2.toString());	
			}
			
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
	
	public Member(){}
	
	public Member(String name, String tel, String gender, int age){
		this.name = name;
		this.tel = tel;
		this.gender = gender;
		this.age = age;
	}
	
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
		return "이름 : " +name+ ", 번호 : " +tel+ ", 성별 : " +gender+ ", 나이 : " +age;
	}
	
}
