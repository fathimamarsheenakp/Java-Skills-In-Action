import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/company?user=root&password=root";
		String sql = "insert into employee values(?,?,?,?,?,?)";
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			
			System.out.println("Enter id, firstname, lastname, age, department and salary");
			int id = sc.nextInt();
			String fName = sc.next();
			String lName = sc.next();
			int age = sc.nextInt();
			String dept = sc.next();
			double salary = sc.nextDouble();
			
			ps.setInt(1, id);
			ps.setString(2, fName);
			ps.setString(3, lName);
			ps.setInt(4, age);
			ps.setString(5, dept);
			ps.setDouble(6, salary);
			
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
