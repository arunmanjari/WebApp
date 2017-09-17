package main.java;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name;
		name = request.getParameter("fname");
		int port = request.getLocalPort();
		String localAdd = request.getLocalAddr();
		String[] colors = request.getParameterValues("color");

		String selectedColor = "";
		if (colors != null) {
			for (String color : colors) {
				if (selectedColor.length() < 1)
					selectedColor = "    " + color;
				else
					selectedColor += "    " + color;
			}
		}

		response.setContentType("text/html");
		response.getWriter().println(
				"This is third servlet. The name you entered is " + name);
		response.getWriter().println(
				"<br>You are calling from Ip and port:: " + localAdd + ":"
						+ port);
		response.getWriter().println("<br>Your fav color" + selectedColor);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
