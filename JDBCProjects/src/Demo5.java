import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bank?user=root&password=root";
		String sql = "insert into ucucu values (?,?,?,?)";
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Class.forName(dpath);
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			
			System.out.println("How many rows of data you want to insert");
			int no = sc.nextInt();
			
			for (int i = 0; i < no; i++) {
				System.out.println("Enter Account number, Name, Email and balance of customer " + i);
				int accNo = sc.nextInt();
				String name = sc.next();
				String email = sc.next();
				int balance = sc.nextInt();
				
				ps.setInt(1, accNo);
				ps.setString(2, name);
				ps.setString(3, email);
				ps.setInt(4, balance);
				
				ps.addBatch();
			}
			
			int[] res = ps.executeBatch();
			
			for (int i : res) {
				System.out.print(i + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
