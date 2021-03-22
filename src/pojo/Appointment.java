package pojo;

public class Appointment {
	private int id;
	private String docName;
	private String enterType;
	private String patTime;
	private String patDate;
	private String patnumber;
	private String patname;
	
	public Appointment(int id, String docName, String enterType, String patTime, String patDate, String patnumber,
			String patname) {
		super();
		this.id = id;
		this.docName = docName;
		this.enterType = enterType;
		this.patTime = patTime;
		this.patDate = patDate;
		this.patnumber = patnumber;
		this.patname = patname;
	}
	public Appointment(String docName, String enterType, String patTime, String patDate, String patnumber,
			String patname) {
		super();
		this.docName = docName;
		this.enterType = enterType;
		this.patTime = patTime;
		this.patDate = patDate;
		this.patnumber = patnumber;
		this.patname = patname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getEnterType() {
		return enterType;
	}
	public void setEnterType(String enterType) {
		this.enterType = enterType;
	}
	public String getPatTime() {
		return patTime;
	}
	public void setPatTime(String patTime) {
		this.patTime = patTime;
	}
	public String getPatDate() {
		return patDate;
	}
	public void setPatDate(String patDate) {
		this.patDate = patDate;
	}
	public String getPatnumber() {
		return patnumber;
	}
	public void setPatnumber(String patnumber) {
		this.patnumber = patnumber;
	}
	public String getPatname() {
		return patname;
	}
	public void setPatname(String patname) {
		this.patname = patname;
	}

	

	
}
