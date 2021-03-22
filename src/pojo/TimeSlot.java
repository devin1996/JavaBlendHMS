package pojo;

public class TimeSlot {
	private int aiID;
	private int empRegNo;
	private String empName;
	private String enterType;
	private String doctorFee;
	private String startTime;
	private String endTime;
	private String aptEffectiveDate;
	private String aptEndDate;
	
	
	
	
	public TimeSlot(int empRegNo, String empName, String enterType, String doctorFee, String startTime, String endTime,
			String aptEffectiveDate, String aptEndDate) {
		super();
		this.empRegNo = empRegNo;
		this.empName = empName;
		this.enterType = enterType;
		this.doctorFee = doctorFee;
		this.startTime = startTime;
		this.endTime = endTime;
		this.aptEffectiveDate = aptEffectiveDate;
		this.aptEndDate = aptEndDate;
	}
	

	public TimeSlot(int aiID,int empRegNo, String empName, String enterType, String doctorFee, String startTime, String endTime,
			String aptEffectiveDate, String aptEndDate) {
		super();
		this.aiID = aiID;
		this.empRegNo = empRegNo;
		this.empName = empName;
		this.enterType = enterType;
		this.doctorFee = doctorFee;
		this.startTime = startTime;
		this.endTime = endTime;
		this.aptEffectiveDate = aptEffectiveDate;
		this.aptEndDate = aptEndDate;
	}

	public TimeSlot() {
		super();
	}

	public int getEmpRegNo() {
		return empRegNo;
	}

	public void setEmpRegNo(int empRegNo) {
		this.empRegNo = empRegNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEnterType() {
		return enterType;
	}

	public void setEnterType(String enterType) {
		this.enterType = enterType;
	}

	public String getDoctorFee() {
		return doctorFee;
	}

	public void setDoctorFee(String doctorFee) {
		this.doctorFee = doctorFee;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getAptEffectiveDate() {
		return aptEffectiveDate;
	}

	public void setAptEffectiveDate(String aptEffectiveDate) {
		this.aptEffectiveDate = aptEffectiveDate;
	}

	public String getAptEndDate() {
		return aptEndDate;
	}

	public void setAptEndDate(String aptEndDate) {
		this.aptEndDate = aptEndDate;
	}

	
	public int getAiID() {
		return aiID;
	}

	public void setAiID(int aiID) {
		this.aiID = aiID;
	}

	@Override
	public String toString() {
		return "TimeSlot [empRegNo=" + empRegNo + ", empName=" + empName + ", enterType=" + enterType + ", doctorFee="
				+ doctorFee + ", startTime=" + startTime + ", endTime=" + endTime + ", aptEffectiveDate="
				+ aptEffectiveDate + ", aptEndDate=" + aptEndDate + "]";
	}
	
	
	
	
}
