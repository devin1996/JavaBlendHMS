package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TimeSlotDAO;
import pojo.TimeSlot;

/**
 * Servlet implementation class UpdateTimeSlotServlet
 */
@WebServlet("/UpdateTimeSlotServlet")
public class UpdateTimeSlotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateTimeSlotServlet() {
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

		int empRegNo = Integer.parseInt(request.getParameter("Id"));
		String empName = request.getParameter("empName");
		String enterType = request.getParameter("enterType");
		String doctorFee = request.getParameter("doctorFee");
		String startTime = request.getParameter("startTime");
		String endTime = request.getParameter("endTime");
		String aptEffectiveDate = request.getParameter("aptEffectiveDate");
		String aptEndDate = request.getParameter("aptEndDate");

		TimeSlot timeslotObj = new TimeSlot(empName, enterType, doctorFee, startTime, endTime,
				aptEffectiveDate, aptEndDate);
		TimeSlotDAO timeslotDAOObj = new TimeSlotDAO();

		if (timeslotObj != null) {
			try {
				timeslotDAOObj.updateTimeSlot(empRegNo,timeslotObj);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("Success");
			response.sendRedirect("success.jsp");
		}
	}

}
