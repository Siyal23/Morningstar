package com.morningstar.model;

public class Employee {
	private int employee_id;
	private String employee_name;
	private float employee_salary;
	private int department_id;
	
	public Employee() {
		
	}
	public Employee(int employee_id, String employee_name, float employee_salary, int department_id) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
		this.department_id = department_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public float getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(float employee_salary) {
		this.employee_salary = employee_salary;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_salary="
				+ employee_salary + ", department_id=" + department_id + "]";
	}
}
