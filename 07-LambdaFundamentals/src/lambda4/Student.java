package lambda4;

public class Student {
	private int studId;
	private String studName;
	private double studScore;

	public Student() {

	}

	public Student(int studId, String studName, double studScore) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studScore = studScore;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public double getStudScore() {
		return studScore;
	}

	public void setStudScore(double studScore) {
		this.studScore = studScore;
	}
	
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studScore=" + studScore + "]";
	}

}
