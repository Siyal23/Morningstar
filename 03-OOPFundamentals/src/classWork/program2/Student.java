package classWork.program2;

public class Student {
	int studId;
	String studName;
	long contactNo;
	String course;
	float fees;
	
	public Student() {
		
	}
	
	
	public Student(int studId, String studName, long contactNo, String course, float fees) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.contactNo = contactNo;
		this.course = course;
		this.fees = fees;
	}


	public String getStudName() {
		return studName;
	}


	public void setStudName(String studName) {
		this.studName = studName;
	}


	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}
	
	public void display() {
		System.out.println(
				"Student Id:"+getStudId()+"\n"+
				"Student Name:"+getStudName()+"\n"+
				"Contact Number:"+getContactNo()+"\n"+
				"Course:"+getCourse()+"\n"+
				"Fees:"+getFees()
				);
	}
}
