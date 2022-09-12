package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Dao.EmployeeEditDao;

import java.io.IOException;

@WebServlet("/Edit")
public class EmployeeEditController extends HttpServlet {
	
private static final long serialVersionUID = 1L;
       
    
    public EmployeeEditController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer id = Integer.parseInt(request.getParameter("id"));
		String empname = request.getParameter("empname");
		String department = request.getParameter("department");
		String skills = request.getParameter("skills");
		int salary = Integer.parseInt(request.getParameter("salary"));
		
        
		EmployeeEditDao tf = new EmployeeEditDao();
		boolean ch2 = tf.updateemployee(id,empname,department,skills,salary);
		
		if (ch2) {
			response.sendRedirect("emp_list.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
