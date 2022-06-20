package com.morningstar.service;

import java.util.List;

import com.morningstar.model.Employee;

public interface EmployeeService {
	public boolean addEmployee(Employee employee);
	public boolean deleteEmployee(int employee_id) ;
	public boolean updateEmployee(int employee_id) ;
	public Employee findById(int employee_id) ;
	public List<Employee> getAllEmployees() ;
	public Employee findByName(String employee_name);
}
