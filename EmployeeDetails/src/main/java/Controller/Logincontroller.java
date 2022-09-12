package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import Dao.Logindao;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")

public class Logincontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
    
	 
    public Logincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("loginid");
		String ps = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Logindao ld = new Logindao();
		Boolean check = ld.checkuser(id,ps);
		
		if(check) {
			HttpSession session = request.getSession();
			session.setAttribute("loginid",id);
			RequestDispatcher rd = request.getRequestDispatcher("emp_list.jsp");
			rd.forward(request, response);
			doGet(request, response);
		}
		else {
			out.println("<script>alert('login id or password is not correct')</script>");
			RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");
			rd2.include(request, response);
			doGet(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
