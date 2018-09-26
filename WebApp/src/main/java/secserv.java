package main.java;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns="/login1")
public class secserv extends HttpServlet {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
			String name=req.getParameter("name");
			PrintWriter pw= res.getWriter();
			pw.println("<html>");
			pw.println("<head>");
			pw.println("<meta http-equiv=\"refresh\" content=\"0; url=http://www.google.com/search?q="+name+"\">");
			pw.println("</head>");
			pw.println("<body>Hi There</body></html>");   
			
			
		}
}
