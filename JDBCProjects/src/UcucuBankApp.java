import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UcucuBankApp {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bank?user=root&password=root";
		String sql1 = "update ucucu set Balance = Balance - ? where AccNo = ?";
		String sql2 = "update ucucu set Balance = Balance + ? where AccNo = ?";
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Class.forName(dpath);
			con = DriverManager.getConnection(url);
			ps1 = con.prepareStatement(sql1);
			ps2 = con.prepareStatement(sql2);
			
			System.out.println("Enter From Acc No, To Acc No and Amount to transfer");
			int from = sc.nextInt();
			int to = sc.nextInt();
			int amount = sc.nextInt();
			
			ps1.setInt(1, amount);
			ps2.setInt(1, amount);
			ps1.setInt(2, from);
			ps2.setInt(2, to);
			
			con.setAutoCommit(false);
			int res1 = ps1.executeUpdate();
			System.out.println("Query OK! " + res1 + " row(s) affected");
			System.out.println(amount + " debited from " + from);
			int res2 = ps2.executeUpdate();
			System.out.println("Query OK! " + res2 + " row(s) affected");
			System.out.println(amount + " credited to " + to);
			con.commit();
			 
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				con.close();
				ps1.close();
				ps2.close();
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
