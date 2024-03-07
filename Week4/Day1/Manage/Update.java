package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

    public void update() {
    	System.out.println("-------------------");
		System.out.println("    멤버 정보 수정    ");
		System.out.println("-------------------");
		System.out.println();
    	
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mariadb://localhost:3306/mydb";
        String user = "root";
        String pw = "1234";
        String query = "UPDATE tbl_member SET %s = ? WHERE %s = ?;";

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pw);

            System.out.print("검색할 데이터의 열 이름 기입 : ");
            String set = sc.nextLine();
            // 여기서 사용자 입력을 검증할 수 있습니다.

            System.out.print("검색할 위치 열 이름 기입 : ");
            String where = sc.nextLine();
            // 여기서 사용자 입력을 검증할 수 있습니다.

            System.out.print("바꾸고 싶은 데이터의 열 이름 기입 : ");
            String re1 = sc.nextLine();

            System.out.print("수정할 내용 기입 : ");
            String re2 = sc.nextLine();

            // Query 작성
            query = String.format(query, re1, set);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, re2);
            pstmt.setString(2, where);

            pstmt.executeUpdate();
            System.out.println("데이터 수정이 완료되었습니다.");

            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
