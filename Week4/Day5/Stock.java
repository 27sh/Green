package project2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Stock {
    public void stock() {
        Connect conn = new Connect();

        String query = "SELECT p.pid, p.pname, COALESCE(i.icnt, 0) AS icnt, COALESCE(o.ocnt, 0) AS ocnt, COALESCE((i.icnt - o.ocnt), 0) AS stock " +
                "FROM prod p " +
                "LEFT JOIN (SELECT pid, SUM(qty) AS icnt FROM incoming GROUP BY pid) i ON p.pid = i.pid " +
                "LEFT JOIN (SELECT pid, SUM(qty) AS ocnt FROM outgoing GROUP BY pid) o ON p.pid = o.pid";

        System.out.println("-------------------");
        System.out.println("      재고 관리      ");
        System.out.println("-------------------");
        System.out.println();

        try {
            Statement stmt = conn.getConnection().createStatement();

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String pid = rs.getString("pid");
                String pname = rs.getString("pname");
                int icnt = rs.getInt("icnt");
                int ocnt = rs.getInt("ocnt");
                int stock = rs.getInt("stock");

                System.out.println("ID: " + pid + ", NAME: " + pname + ", IN COUNT: " + icnt + ", OUT COUNT: " + ocnt + ", STOCK: " + stock);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
