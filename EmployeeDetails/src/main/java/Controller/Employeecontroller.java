package Controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import Dao.Employeedao;

import java.io.IOException;

@WebServlet("/insert")
public class Employeecontroller extends HttpServlet{

private static final long serialVersionUID = 1L;
       
    
    public Employeecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();

		String empname = request.getParameter("empname");
		String department = request.getParameter("department");
		String skills = request.getParameter("skills"); 
		int salary = Integer.parseInt(request.getParameter("salary")); 
		String loginid = (String)session.getAttribute("loginid");
		
		
		
		Employeedao ed = new Employeedao();
		
		ed.addemployee(loginid, empname, department, skills, salary);		
		response.sendRedirect("emp_list.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
