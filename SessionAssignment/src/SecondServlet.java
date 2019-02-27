

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		String fname = (String) session.getAttribute("firstname");
		String lname = request.getParameter("lastname");
		session.setAttribute("lastname", lname);
		PrintWriter out = response.getWriter();
		out.println("First Name :"+fname);
		out.println("<br>");
		out.println("Last Name :"+lname);
		out.println("<br>");
		out.println("<html>"
				+ "<body>"
				+ "<form action=ThirdServlet method=post>"
				+"Qualification :<input type=text name=qualify required/>"  
				+"<input type=submit />"  
				+"</form>"
				+ "</body>"
				+ "</html>");
	}

}
