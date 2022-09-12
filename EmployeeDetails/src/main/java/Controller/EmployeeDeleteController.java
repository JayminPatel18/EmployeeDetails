package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Dao.EmployeeDeleteDao;

import java.io.IOException;

@WebServlet("/Delete")
public class EmployeeDeleteController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public EmployeeDeleteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Integer id = Integer.parseInt(request.getParameter("id"));

		EmployeeDeleteDao tl = new EmployeeDeleteDao();
		boolean ch = tl.deleteemployee(id);

		if (ch) {
			response.sendRedirect("emp_list.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
