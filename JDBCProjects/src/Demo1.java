import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "Select * from employee where id = ?";
		ResultSet rs = null;
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/company";
		String user = "root";
		String password = "root";
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			System.out.println("Enter the id");
			int id = sc.nextInt();
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getInt(4) + " | " + rs.getString(5) +" | " + rs.getDouble(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
				rs.close();
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
