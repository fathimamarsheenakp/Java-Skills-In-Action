


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Greet
 */
public class Greet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.sendRedirect("/GreetApp/Greeting.html");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
