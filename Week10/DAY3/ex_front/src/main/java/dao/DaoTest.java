package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoTest {
	public static void main(String[] args) throws SQLException {
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection conn = DriverManager.getConnection(
						"jdbc:maraidb://localhost:3306/managedb",
						"root",
						"1234"
						);
				
				if(conn != null) {
					System.out.println("Connection 객체 획득 성공!");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

	}
}
