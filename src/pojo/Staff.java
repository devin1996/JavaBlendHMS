package pojo;

public class Staff {

	private int aiID;
	private int empRegNo;
	private int empDepNo;
	private String empName;
	private String empDesignation;
	private String empType;
	private String empGender;
	private String empSalary;
	private String empEffectiveDate;
	
	
	
	public Staff(int empRegNo, int empDepNo, String empName, String empDesignation, String empType, String empGender,
			String empSalary, String empEffectiveDate) {
		super();
		this.empRegNo = empRegNo;
		this.empDepNo = empDepNo;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empType = empType;
		this.empGender = empGender;
		this.empSalary = empSalary;
		this.empEffectiveDate = empEffectiveDate;
	}

	public Staff(int aiID,int empRegNo, int empDepNo, String empName, String empDesignation, String empType, String empGender,
			String empSalary, String empEffectiveDate) {
		super();
		this.aiID = aiID;
		this.empRegNo = empRegNo;
		this.empDepNo = empDepNo;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empType = empType;
		this.empGender = empGender;
		this.empSalary = empSalary;
		this.empEffectiveDate = empEffectiveDate;
	}

	public Staff() {
		super();
	}

	public int getEmpRegNo() {
		return empRegNo;
	}

	public void setEmpRegNo(int empRegNo) {
		this.empRegNo = empRegNo;
	}

	public int getEmpDepNo() {
		return empDepNo;
	}

	public void setEmpDepNo(int empDepNo) {
		this.empDepNo = empDepNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpEffectiveDate() {
		return empEffectiveDate;
	}

	public void setEmpEffectiveDate(String empEffectiveDate) {
		this.empEffectiveDate = empEffectiveDate;
	}

	
	public int getAiID() {
		return aiID;
	}

	public void setAiID(int aiID) {
		this.aiID = aiID;
	}

	@Override
	public String toString() {
		return "Staff [empRegNo=" + empRegNo + ", empDepNo=" + empDepNo + ", empName=" + empName + ", empDesignation="
				+ empDesignation + ", empType=" + empType + ", empGender=" + empGender + ", empSalary=" + empSalary
				+ ", empEffectiveDate=" + empEffectiveDate + "]";
	}
	
	
	
	
}
