import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class ucucuBankApp2 {

	public static void main(String[] args) {
		
		Connection con = null;
		CallableStatement cs = null;
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bank?user=root&password=root";
		ResultSet rs = null;
		String sql = "call getdetails(?)";
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Class.forName(dpath);
			con = DriverManager.getConnection(url);
			cs = con.prepareCall(sql);
			
			System.out.println("Enter id");
			int id = sc.nextInt();
			cs.setInt(1, id);
			boolean res = cs.execute();
			
			if (res == true) {
				rs = cs.getResultSet();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
				}
			} else {
				int no = cs.getUpdateCount();
				System.out.println("Query OK! " + no + " row(s) affected");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				cs.close();
				if (rs != null) {
					rs.close();
				}
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
