import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/company?user=root&password=root";
		String sql = "update employee set l_name=? where id=?";
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Class.forName(dpath);
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			
			System.out.println("Enter lastname and id to update");
			String lname = sc.next();
			int id = sc.nextInt();
			
			ps.setString(1, lname);
			ps.setInt(2, id);
			
			int no = ps.executeUpdate();
			System.out.println("Query OK! " + no + " row(s) affected");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
