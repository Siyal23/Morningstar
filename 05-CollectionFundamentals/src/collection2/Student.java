package collection2;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studId;
		result = prime * result + ((studName == null) ? 0 : studName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(studScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studId != other.studId)
			return false;
		if (studName == null) {
			if (other.studName != null)
				return false;
		} else if (!studName.equals(other.studName))
			return false;
		if (Double.doubleToLongBits(studScore) != Double.doubleToLongBits(other.studScore))
			return false;
		return true;
	}

	
	 
}
