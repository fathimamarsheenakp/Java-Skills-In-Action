

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
public class Result extends HttpServlet {
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String path = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/company?user=root&password=root";
	String sql = "select * from university where id = ?";
	
	
	public void init() {
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void service(HttpServletRequest request, HttpServletResponse response) {
		try {
			ps = con.prepareStatement(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		try {
			rs.close();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
