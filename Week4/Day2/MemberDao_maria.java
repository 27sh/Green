package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import vo.Member;

public class MemberDao_maria implements IMemberDao {
	
	Connect conn = new Connect();
	
	Scanner sc = new Scanner(System.in);

	@Override
	public boolean insert(Member m) {
		String query = "insert into tbl_note values (null, null, ?, ?)";
		
		try {
			PreparedStatement pstmt = conn.getConnection().prepareStatement(query);
			pstmt.setString(1, m.getTitle());
			pstmt.setString(2, m.getWrite());
			
			pstmt.executeUpdate();
			
			System.out.println("게시글  ["+m.getTitle()+"] 작성이 완료되었습니다.");
			System.out.println("-------------------");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public void selectAll() {
		String query = ("SELECT * from tbl_note");
		
		Statement stmt;
		try {
			stmt = conn.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String title = rs.getString("title");
				String id = rs.getString("id");
				int mno = rs.getInt("mno");
				
				System.out.println("::"+mno+"::   ["+title+ "] 작성자 : " +id);	
			}	
			
			System.out.println("자세히 보려는 게시글의 번호를 입력해주세요.");
			System.out.println("나가기 : 0");
			
			int num = sc.nextInt();
			
			seeNote(num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void findByid() {
		
		String query = ("SELECT * from tbl_note WHERE id LIKE ?");	
		
		System.out.print("작성자 이름 기입 : ");
		String inputID = sc.next();
		
		PreparedStatement pstmt;
		try {
			pstmt = conn.getConnection().prepareStatement(query);
			pstmt.setString(1, inputID);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String title = rs.getString("title");
				String id1 = rs.getString("id");
				int mno = rs.getInt("mno");
				
				System.out.println("::"+mno+"::   ["+title+ "] 작성자 : " +id1);
			}
			
			System.out.println("자세히 보려는 게시글의 번호를 입력해주세요.");
			System.out.println("나가기 : 0");
			
			int num = sc.nextInt();
			
			seeNote(num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void findByTitle() {
		String query = ("SELECT * from tbl_note WHERE title LIKE ?");

		System.out.print("제목 기입 : ");
		String inputTitle = sc.next();
		
		PreparedStatement pstmt;
		try {
			pstmt = conn.getConnection().prepareStatement(query);
			pstmt.setString(1, inputTitle);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String title1 = rs.getString("title");
				String id = rs.getString("id");
				int mno = rs.getInt("mno");
	
				System.out.println("::"+mno+"::   ["+title1+ "] 작성자 : " +id);
			}
			
			System.out.println("자세히 보려는 게시글의 번호를 입력해주세요.");
			System.out.println("나가기 : 0");
			
			int num = sc.nextInt();
			
			seeNote(num);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update() {
		String query = "UPDATE tbl_note SET %s = ? WHERE title = ?;";

        try {
            System.out.print("수정할 글의 제목 입력 : ");
            String str = sc.nextLine();
            String findTitle = sc.nextLine();

            System.out.print("제목 수정 : title 입력 | 내용 수정 : writing 입력");
            String input = sc.nextLine();

            System.out.print("수정할 내용 기입 : ");
            String re = sc.nextLine();

            // Query 작성
            query = String.format(query, input);
            PreparedStatement pstmt = conn.getConnection().prepareStatement(query);
            pstmt.setString(1, re);
            pstmt.setString(2, findTitle);

            pstmt.executeUpdate();

            pstmt.close();
            conn.getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void delete(int mno) {
		String query = "DELETE FROM tbl_note WHERE mno = ?";
		
		try {
			PreparedStatement pstmt = conn.getConnection().prepareStatement(query);
			pstmt.setInt(1, mno);
			pstmt.execute();
			
			System.out.println("고유 번호 "+mno+"번 이 삭제되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void seeNote(int mno) {	
		if(mno != 0) {
			System.out.println();
			
			String query = ("SELECT * from tbl_note WHERE mno = ?");
			
			PreparedStatement pstmt;
			try {
				pstmt = conn.getConnection().prepareStatement(query);
				pstmt.setInt(1, mno);
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					String title = rs.getString("title");
					String id = rs.getString("id");
					String note = rs.getString("writing");
					
					System.out.println("────────────────────────────────────────────");
					System.out.println("제목 : " +title+"      │ 작성자 : " +id);
					System.out.println("────────────────────────────────────────────");
					System.out.println(note);
					System.out.println("────────────────────────────────────────────");

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}



}
