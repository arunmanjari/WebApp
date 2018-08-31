package main.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns="/login")
public class FirstServlet extends HttpServlet {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
			System.out.println("parameter value"+req.getParameter("name"));
			PrintWriter pw= res.getWriter();
			pw.println("This is a servlet Response "+new Date());
			pw.println("I got this as parameter "+req.getParameter("name"));
			
		}
}
