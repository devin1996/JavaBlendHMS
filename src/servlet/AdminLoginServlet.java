package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import pojo.Admin;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter pw = response.getWriter();
		doGet(request, response);

		String phoneNo = request.getParameter("mobileNo");
		String password = request.getParameter("pwd");

		UserDAO adminDAO = new UserDAO();
		try {
			Admin adminObj = adminDAO.validateAdmin(phoneNo,password);
			//pw.println(adminObj.toString());
			if (adminObj != null) {
				String adminPhoneNo = adminObj.getAdminMobileNo();
				String adminPwd = adminObj.getAdminPassword();

				if (adminPhoneNo.equals(phoneNo) && adminPhoneNo.equals(phoneNo)) {
					HttpSession session = request.getSession();
					
					session.setAttribute("adminMobile", adminPhoneNo);
					session.setAttribute("adminObj", adminObj);
					session.setAttribute("adminName", adminObj.getAdminName());
					
					System.out.print("Admin Login Successful");
					response.sendRedirect("AdminHome.jsp");
				} else {
					
					//RequestDispatcher rd = getServletContext().getRequestDispatcher("/AdminLogin.jsp");
					//rd.include(request, response);
					pw.println("<p>Username or password is incorrect</p>");
					pw.println("<a href='AdminLogin.jsp'>Back to Login Page</a>");
					
//					String message = "Username or password is incorrect";
//					request.setAttribute("message", message);
//					request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
					
					//response.sendRedirect("/admin_login.html");
					//response.setStatus(response.SC_MOVED_TEMPORARILY);
					//response.setHeader("Location", "admin_login.html");
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
