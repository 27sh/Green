package project2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import vo.Product;

public class Store {
	public class store {}
	
	public void store() {
		Connect conn = new Connect();

		String query = "insert into incoming values (?, ?)";
		String checkQuery = "SELECT * FROM prod WHERE pid = ?";
		
		System.out.println("-------------------");
		System.out.println("        입고        ");
		System.out.println("-------------------");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int flag = 0;
		
		ArrayList<Product> list = new ArrayList<>();
		
		while(true) {
			if(flag == 1) {
				System.out.println("종료되었습니다.");
				break;
			}
			else {
				Product m = new Product();
				
				System.out.print("Input Product ID >> ");
				String pid	;
				pid = sc.next();
				m.setPid(pid);
				
				System.out.print("Input Amout of Produt >> ");
				int qty;
				qty = sc.nextInt();
				m.setQty(qty);

				list.add(m);
								
				try {
					PreparedStatement checkStmt = conn.getConnection().prepareStatement(checkQuery);
                    checkStmt.setString(1, pid);
                    ResultSet rs = checkStmt.executeQuery();
                    
                    if(rs.next()) {
                    	PreparedStatement pstmt = conn.getConnection().prepareStatement(query);
    					pstmt.setString(1, pid);
    					pstmt.setInt(2, qty);
    					
    					pstmt.executeUpdate();
    					
    					System.out.println("[ ID : "+m.getPid()+", "+m.getQty()+" 개] 가 입고되었습니다.");
    					System.out.println("-------------------");
    					System.out.println("계속 입고 하시겠습니까?");
    					System.out.println("0 : 계속 | 1 : 취소");
                    }
                    else {
                    	System.out.println("해당 제품이 존재하지 않습니다.");
    					System.out.println("계속 입고 하시겠습니까?");
    					System.out.println("0 : 계속 | 1 : 취소");
                    }
		
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				flag = sc.nextInt();
			}
		}

	}
}
