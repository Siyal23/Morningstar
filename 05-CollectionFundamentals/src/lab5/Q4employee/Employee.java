package lab5.Q4employee;

public class Employee {
	private int empId;
	private String empName;
	private String address;
	private float sal;
	
	public Employee() {
		
	}
	public Employee(int empId, String empName, String address, float sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.sal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + Float.floatToIntBits(sal);
		return result;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", sal=" + sal + "]";
	}
	
	
	
}
