package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import pojo.Patient;

/**
 * Servlet implementation class PatientRegisterServlet
 */
@WebServlet("/PatientRegisterServlet")
public class PatientRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PatientRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String patName= request.getParameter("patName");
		String patPassword= request.getParameter("patPassword");
		String patNIC= request.getParameter("patNIC");
		String patMobileNo= request.getParameter("patMobileNo");
		String bloodGroup= request.getParameter("bloodGroup");
		
		Patient patObj = new Patient(patName, patPassword, patNIC, patMobileNo, bloodGroup);
		
		UserDAO daoObj = new UserDAO();
		if (patObj!=null) {
			daoObj.savePatient(patObj);
			//System.out.print("Success");
			response.sendRedirect("index.jsp");
		}
		
	}

}
