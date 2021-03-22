package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import pojo.Admin;
import pojo.Patient;

/**
 * Servlet implementation class PatientLoginServlet
 */
@WebServlet("/PatientLoginServlet")
public class PatientLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientLoginServlet() {
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
		doGet(request, response);
		PrintWriter pw = response.getWriter();
		doGet(request, response);

		String phoneNo = request.getParameter("mobileNo");
		String password = request.getParameter("pwd");

		UserDAO adminDAO = new UserDAO();
		try {
			Patient Obj = adminDAO.validatePatient(phoneNo,password);
			//pw.println(adminObj.toString());
			if (Obj != null) {
				String adminPhoneNo = Obj.getPatMobileNo();
				String adminPwd = Obj.getPatPassword();

				if (adminPhoneNo.equals(phoneNo) && adminPhoneNo.equals(phoneNo)) {
					HttpSession session = request.getSession();
					
					session.setAttribute("patientMobile", adminPhoneNo);
					session.setAttribute("patObj", Obj);
					session.setAttribute("patName", Obj.getPatName());
					
					System.out.print("Patient Login Successful");
					response.sendRedirect("patient_home.jsp");
				} else {
					
					pw.println("<p>Username or password is incorrect</p>");
					pw.println("<a href='index.jsp'>Back to Login Page</a>");
					

				}

			} else {
				System.out.println("Admin Object returned a null value;");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
