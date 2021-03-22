package pojo;

public class Patient {
	private String patName, patPassword, patNIC, patMobileNo, bloodGroup;
	private int patID;
	
	
	public Patient() {
		super();
	}
	
	
	public Patient(String patName, String patPassword, String patNIC, String patMobileNo, String bloodGroup) {
		super();
		this.patName = patName;
		this.patPassword = patPassword;
		this.patNIC = patNIC;
		this.patMobileNo = patMobileNo;
		this.bloodGroup = bloodGroup;
	}


	public Patient(String patName, String patPassword, String patNIC, String patMobileNo, String bloodGroup,
			int patID) {
		super();
		this.patName = patName;
		this.patPassword = patPassword;
		this.patNIC = patNIC;
		this.patMobileNo = patMobileNo;
		this.bloodGroup = bloodGroup;
		this.patID = patID;
	}
	public String getPatName() {
		return patName;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public String getPatPassword() {
		return patPassword;
	}
	public void setPatPassword(String patPassword) {
		this.patPassword = patPassword;
	}
	public String getPatNIC() {
		return patNIC;
	}
	public void setPatNIC(String patNIC) {
		this.patNIC = patNIC;
	}
	public String getPatMobileNo() {
		return patMobileNo;
	}
	public void setPatMobileNo(String patMobileNo) {
		this.patMobileNo = patMobileNo;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getPatID() {
		return patID;
	}
	public void setPatID(int patID) {
		this.patID = patID;
	}
	
	
}
