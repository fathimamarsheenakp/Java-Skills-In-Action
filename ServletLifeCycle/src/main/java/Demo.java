

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
       
    public Demo() {
    	System.out.println("OBJECT CREATED....");
    }
    
    public void init() {
    	System.out.println("INIT EXECUTED");
    }

    public void service(HttpServletRequest request, HttpServletResponse response) {
    	System.out.println("SERVICE EXECUTED");
    }

    public void destroy() {
    	System.out.println("DESTROY EXECUTED");
    }
}
