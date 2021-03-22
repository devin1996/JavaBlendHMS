package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AppointmentDAO;
import dao.TimeSlotDAO;
import pojo.Appointment;
import pojo.TimeSlot;

/**
 * Servlet implementation class AppointmentServlet
 */
@WebServlet("/AppointmentServlet")
public class AppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AppointmentServlet() {
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
		HttpSession session =request.getSession();
		String patName = (String)session.getAttribute("patName");
		String patMobileno = (String)session.getAttribute("patientMobile");
		System.out.println(patMobileno+""+patName);
		String docName = request.getParameter("docName");
		String enterType = request.getParameter("enterType");
		String patTime = request.getParameter("patTime");
		String patDate = request.getParameter("patDate");
		
		 Appointment Obj = new Appointment(docName, enterType, patTime, patDate, patMobileno, patName);
		 AppointmentDAO daoObj = new AppointmentDAO();
		 
			if (Obj!=null) {
				daoObj.saveApt(Obj);
				System.out.print("Success");
				response.sendRedirect("patsuccess.jsp");
			}

	}

}
