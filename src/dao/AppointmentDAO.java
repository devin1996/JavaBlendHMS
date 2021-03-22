package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBConnection;
import pojo.Appointment;
import pojo.TimeSlot;

public class AppointmentDAO {

	public void saveApt(Appointment appointment) {
		try {
			Connection conn = DBConnection.getConnection();
			String inserquery = "insert into appointment(apt_id,docName,enterType,patTime,patDate,patnumber,patname)values(apt_seq.NEXTVAL,'pending',?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(inserquery);

			ps.setString(1, appointment.getEnterType());
			ps.setString(2, appointment.getPatTime());
			ps.setString(3, appointment.getPatDate());
			ps.setString(4, appointment.getPatnumber());
			ps.setString(5, appointment.getPatname());

			int row = ps.executeUpdate();
			System.out.println("Inserted a Apt Sucessfully");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public List<Appointment> getApts() {
		List<Appointment> aptList = new ArrayList<Appointment>();

		Appointment aptlotObj = null;

		try {
			Connection conn = DBConnection.getConnection();
			String query;

			query = "select * from appointment";

			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int aiID = rs.getInt(1);
				String docName = rs.getString(2);
				String enterType = rs.getString(3);
				String patTime = rs.getString(4);
				String patDate = rs.getString(5);
				String patnumber = rs.getString(6);
				String patname = rs.getString(7);

				aptlotObj = new Appointment(aiID, docName, enterType, patTime, patDate, patnumber, patname);
				aptList.add(aptlotObj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return aptList;
	}
	
	
	public List<Appointment> getAptsInd(String patnumbers) {
		List<Appointment> aptList = new ArrayList<Appointment>();
		
		Appointment aptlotObj = null;

		try {
			Connection conn = DBConnection.getConnection();
			String query;

			query = "select * from appointment where patnumber=?";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, patnumbers);
			ResultSet rs = ps.executeQuery();
			System.out.println(patnumbers);
			while (rs.next()) {

				int aiID = rs.getInt(1);
				String docName = rs.getString(2);
				String enterType = rs.getString(3);
				String patTime = rs.getString(4);
				String patDate = rs.getString(5);
				String patnumber = rs.getString(6);
				String patname = rs.getString(7);

				aptlotObj = new Appointment(aiID, docName, enterType, patTime, patDate, patnumber, patname);
				aptList.add(aptlotObj);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return aptList;
	}


}
