package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBConnection;
import pojo.Staff;
import pojo.TimeSlot;

public class TimeSlotDAO {

	public void saveTimeSlot(TimeSlot timeSlot) {
		try {
			Connection conn = DBConnection.getConnection();
			String inserquery = "insert into timeslot(time_slot_id,emp_reg_no,emp_name,enter_type,doctor_fee,start_time,end_time,start_date,end_date)values(timeslot_seq.NEXTVAL,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(inserquery);

			ps.setInt(1, timeSlot.getEmpRegNo());
			ps.setString(2, timeSlot.getEmpName());
			ps.setString(3, timeSlot.getEnterType());
			ps.setString(4, timeSlot.getDoctorFee());
			ps.setString(5, timeSlot.getStartTime());
			ps.setString(6, timeSlot.getEndTime());
			ps.setString(7, timeSlot.getAptEffectiveDate());
			ps.setString(8, timeSlot.getAptEndDate());

			int row = ps.executeUpdate();
			System.out.println("Inserted a TimeSlot Sucessfully");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public List<TimeSlot> getTimeSlots() {
		List<TimeSlot> timeSlotList = new ArrayList<TimeSlot>();

		TimeSlot timeslotObj = null;

		try {
			Connection conn = DBConnection.getConnection();
			String query;

			query = "select * from timeslot";

			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int aiID = rs.getInt(1);
				int empRegNo = rs.getInt(2);
				String empName = rs.getString(3);
				String enterType = rs.getString(4);
				String doctorFee = rs.getString(5);
				String startTime = rs.getString(6);
				String endTime = rs.getString(7);
				String aptEffectiveDate = rs.getString(8);
				String aptEndDate = rs.getString(9);

				timeslotObj = new TimeSlot(aiID, empRegNo, empName, enterType, doctorFee, startTime, endTime,
						aptEffectiveDate, aptEndDate);
				timeSlotList.add(timeslotObj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return timeSlotList;
	}

	public void updateTimeSlot(int id, TimeSlot timeSlot) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.getConnection();
		String inserquery = "update timeslot set emp_name=?,enter_type=?,doctor_fee=?,start_time=?,end_time=?,start_date=?,end_date=? where time_slot_id=?";
		PreparedStatement ps = conn.prepareStatement(inserquery);

		ps.setString(1, timeSlot.getEmpName());
		ps.setString(2, timeSlot.getEnterType());
		ps.setString(3, timeSlot.getDoctorFee());
		ps.setString(4, timeSlot.getStartTime());
		ps.setString(5, timeSlot.getEndTime());
		ps.setString(6, timeSlot.getAptEffectiveDate());
		ps.setString(7, timeSlot.getAptEndDate());
		ps.setInt(8, id);

		int row = ps.executeUpdate();
		System.out.println("Updated a TimeSlot Sucessfully");
	}

	public void saveTimeSlot(int val) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection co = DBConnection.getConnection();
		String q = "delete from timeslot where time_slot_id=?";
		PreparedStatement p = co.prepareStatement(q);
		p.setInt(1, val);
		int a = p.executeUpdate();
		
	}

}
