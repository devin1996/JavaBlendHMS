package pojo;

public class Admin {
	String adminName, adminPassword, adminNIC, adminMobileNo;
	int adminID;

	public Admin(String adminName, String adminPassword, String adminNIC, String adminMobileNo, int adminID) {
		super();
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminNIC = adminNIC;
		this.adminMobileNo = adminMobileNo;
		this.adminID = adminID;
	}
	
	
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", adminPassword=" + adminPassword + ", adminNIC=" + adminNIC
				+ ", adminMobileNo=" + adminMobileNo + ", adminID=" + adminID + "]";
	}


	public Admin() {
	}


	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminNIC() {
		return adminNIC;
	}

	public void setAdminNIC(String adminNIC) {
		this.adminNIC = adminNIC;
	}

	public String getAdminMobileNo() {
		return adminMobileNo;
	}

	public void setAdminMobileNo(String adminMobileNo) {
		this.adminMobileNo = adminMobileNo;
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

}
