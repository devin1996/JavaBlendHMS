package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBConnection;
import pojo.Admin;
import pojo.Patient;
import pojo.Staff;

public class UserDAO {

//	Admin
	public Admin validateAdmin(String phone, String pwd) throws ClassNotFoundException, SQLException {
		Admin adminObj = null;
		Connection con = DBConnection.getConnection();
		String query = "Select * from admin where admin_mobile_no=? and admin_password=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, phone);
		ps.setString(2, pwd);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			String adminName = rs.getString("admin_name");
			String adminPassword = rs.getString("admin_password");
			String adminNIC = rs.getString("admin_nic");
			String adminMobileNo = rs.getString("admin_mobile_no");
			int adminID = rs.getInt("admin_id");

			adminObj = new Admin(adminName, adminPassword, adminNIC, adminMobileNo, adminID);

		}
		return adminObj;

	}


	public Patient validatePatient(String phone, String pwd) throws ClassNotFoundException, SQLException {
		Patient Obj = null;
		Connection con = DBConnection.getConnection();
		String query = "Select * from patient where pat_mobile_no=? and pat_password=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, phone);
		ps.setString(2, pwd);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			String patName = rs.getString("pat_name");
			String patPassword  = rs.getString("pat_password");
			String patNIC  = rs.getString("pat_nic");
			String patMobileNo  = rs.getString("pat_mobile_no");
			String bloodGroup  = rs.getString("pat_blood_grp");
			int patID = rs.getInt("pat_id");

			Obj = new Patient(patName, patPassword, patNIC, patMobileNo, bloodGroup, patID);

		}
		return Obj;

	}
	
	public void savePatient(Patient patient) {
		try {
			Connection conn = DBConnection.getConnection();
			String inserquery = "insert into patient(pat_id,pat_name,pat_nic,pat_mobile_no,pat_password,pat_blood_grp)values(pat_seq.NEXTVAL,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(inserquery);

			ps.setString(1, patient.getPatName());
			ps.setString(2, patient.getPatNIC());
			ps.setString(3, patient.getPatMobileNo());
			ps.setString(4, patient.getPatPassword());
			ps.setString(5, patient.getBloodGroup());

			int row = ps.executeUpdate();
			//System.out.println("Inserted a Staff Member Sucessfully");
			
		} catch (Exception e) {
			e.printStackTrace();

		}

	}	

	public void saveStaff(Staff staff) {
		try {
			Connection conn = DBConnection.getConnection();
			String inserquery = "insert into staff(staff_id,emp_reg_no,emp_dep_no,emp_name,emp_designation,enter_type,emp_gender,emp_salary,emp_effective_date)values(staff_seq.NEXTVAL,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(inserquery);

			ps.setInt(1, staff.getEmpRegNo());
			ps.setInt(2, staff.getEmpDepNo());
			ps.setString(3, staff.getEmpName());
			ps.setString(4, staff.getEmpDesignation());
			ps.setString(5, staff.getEmpType());
			ps.setString(6, staff.getEmpGender());
			ps.setString(7, staff.getEmpSalary());
			ps.setString(8, staff.getEmpEffectiveDate());

			int row = ps.executeUpdate();
			//System.out.println("Inserted a Staff Member Sucessfully");
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		
	}

	public List<Staff> getAllPharama() {
		List<Staff> staffList = new ArrayList<Staff>();

		Staff staffObj = null;

		try {
			Connection conn = DBConnection.getConnection();
			String query;
			
				query = "select * from staff where enter_type ='pharmacist'";

			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int aiID = rs.getInt(1);
				int empRegNo = rs.getInt(2);
				int empDepNo = rs.getInt(3);
				String empName = rs.getString(4);
				String empDesignation = rs.getString(5);
				String empType = rs.getString(6);
				String empGender = rs.getString(7);
				String empSalary = rs.getString(8);
				String empEffectiveDate = rs.getString(9);

				staffObj = new Staff(aiID, empRegNo, empDepNo, empName, empDesignation, empType, empGender, empSalary,
						empEffectiveDate);
				staffList.add(staffObj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return staffList;
	}
	
	public List<Staff> getAllDoctors() {
		List<Staff> staffList = new ArrayList<Staff>();

		Staff staffObj = null;

		try {
			Connection conn = DBConnection.getConnection();
			String query;
			
				query = "select * from staff where enter_type='doctor'";

			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int aiID = rs.getInt(1);
				int empRegNo = rs.getInt(2);
				int empDepNo = rs.getInt(3);
				String empName = rs.getString(4);
				String empDesignation = rs.getString(5);
				String empType = rs.getString(6);
				String empGender = rs.getString(7);
				String empSalary = rs.getString(8);
				String empEffectiveDate = rs.getString(9);

				staffObj = new Staff(aiID, empRegNo, empDepNo, empName, empDesignation, empType, empGender, empSalary,
						empEffectiveDate);
				staffList.add(staffObj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return staffList;
	}
	
	public List<Staff> getAllNurse() {
		List<Staff> staffList = new ArrayList<Staff>();

		Staff staffObj = null;

		try {
			Connection conn = DBConnection.getConnection();
			String query;
			
				query = "select * from staff where enter_type ='nurse'";

			PreparedStatement ps = conn.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int aiID = rs.getInt(1);
				int empRegNo = rs.getInt(2);
				int empDepNo = rs.getInt(3);
				String empName = rs.getString(4);
				String empDesignation = rs.getString(5);
				String empType = rs.getString(6);
				String empGender = rs.getString(7);
				String empSalary = rs.getString(8);
				String empEffectiveDate = rs.getString(9);

				staffObj = new Staff(aiID, empRegNo, empDepNo, empName, empDesignation, empType, empGender, empSalary,
						empEffectiveDate);
				staffList.add(staffObj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return staffList;
	}
}
