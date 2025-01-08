import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		try {
			
//			step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded!");
			
//			step 2 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
			System.out.println("Connection established");
			
//			step 3
			Statement st = con.createStatement();
			System.out.println("Created medium");
			
//			step 4
			String sql = "select * from employee";
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Query executed");
			System.out.println();
			
//			step 5
			System.out.println("ID| FIRST NAME | LAST NAME | AGE | DEPARTMENT | SALARY");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " | " + rs.getString(2) + "      | " + rs.getString(3) + "    | " + rs.getInt(4) + " | " + rs.getString(5) +" | " + rs.getDouble(6));
			}
			System.out.println();
			
//			step 6
			con.close();
			st.close();
			rs.close();
			System.out.println("Closed the resources");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
