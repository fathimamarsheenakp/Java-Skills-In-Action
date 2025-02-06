

import java.io.PrintWriter;
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
	String url = "jdbc:mysql://localhost:3306/university?user=root&password=root";
	String sql = "select * from result where id = ?";
	PrintWriter pw = null;
	
	
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
			String rollno = request.getParameter("rollno");
			if (rollno == null || rollno.trim().isEmpty()) {
	            response.sendRedirect("/UniversityResult/home.html");
	            return;
	        }
			int id = Integer.parseInt(rollno);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			pw = response.getWriter();
			
			if (rs.next()) {
				pw.println("<!DOCTYPE html>");
				pw.print("<html>");
				pw.println("<head>");
				pw.println("<title>Student Results</title>");
				pw.println("<style>");
				pw.println("table { width: 50%; border-collapse: collapse; margin: 25px 0; }");
				pw.println("th, td { padding: 8px 12px; border: 1px solid #ddd; text-align: left; }");
				pw.println("th { background-color: #f2f2f2; }");
				pw.println("</style>");
				pw.println("</head>");
				pw.println("<body>");
				pw.println("<h1>Student Results</h1>");
				pw.println("<h3>Name: " + rs.getString(2) + "</h3>");
				pw.println("<table>");
				pw.println("<tr>");
				pw.println("<th>SQL</th>");
				pw.println("<td> " + rs.getInt(5) + "</td>");
				pw.println("</tr>");
				pw.println("<tr>");
				pw.println("<th>Testing</th>");
				pw.println("<td> " + rs.getInt(6) + "</td>");
				pw.println("</tr>");
				pw.println("<tr>");
				pw.println("<th>JavaScript</th>");
				pw.println("<td> " + rs.getInt(7) + "</td>");
				pw.println("</tr>");
				pw.println("<tr>");
				pw.println("<th>Java</th>");
				pw.println("<td> " + rs.getInt(4) + "</td>");
				pw.println("</tr>");
				pw.println("</table>");
				pw.println("</body>");
				pw.println("</html>");
			} else {
				response.sendRedirect("/UniversityResult/error.html");
			}
			
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
