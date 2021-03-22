package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import pojo.Staff;

/**
 * Servlet implementation class InsertStaffServler
 */
@WebServlet("/InsertStaffServler")
public class InsertStaffServler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertStaffServler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		int empRegNo = Integer.parseInt(request.getParameter("empRegNo"));
		int empDepNo = Integer.parseInt(request.getParameter("empDepNo"));
		String empName = request.getParameter("empName");
		String empDesignation = request.getParameter("empDesignation");
		String empType = request.getParameter("empType");
		String empGender = request.getParameter("empGender");
		String empSalary = request.getParameter("empSalary");
		String empEffectiveDate = request.getParameter("empEffectiveDate");
		
		Staff obj = new Staff(empRegNo, empDepNo, empName, empDesignation, empType, empGender, empSalary, empEffectiveDate);
		UserDAO daoObj = new UserDAO();
		if (obj!=null) {
			daoObj.saveStaff(obj);
			//System.out.print("Success");
			response.sendRedirect("success.jsp");
		}
		
	}

}
